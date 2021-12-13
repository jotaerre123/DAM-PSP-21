package com.salesianostrinana.dam.gasApp.services;

import com.salesianostrinana.dam.gasApp.dto.CreateEstacionDto;
import com.salesianostrinana.dam.gasApp.dto.EstacionDtoConverter;
import com.salesianostrinana.dam.gasApp.errores.excepciones.ListEntityNotFoundException;
import com.salesianostrinana.dam.gasApp.errores.excepciones.SingleEntityNotFoundException;
import com.salesianostrinana.dam.gasApp.model.Estacion;
import com.salesianostrinana.dam.gasApp.repos.EstacionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstacionService {

    private final EstacionRepository estacionRepository;
    private final EstacionDtoConverter estacionDtoConverter;

    public ResponseEntity<List<Estacion>> findAll(){
        List<Estacion> result = estacionRepository.findAll();

        if (result.isEmpty()){
            throw new ListEntityNotFoundException(Estacion.class);
        }else{
            return ResponseEntity.ok(result);
        }
    }

    public ResponseEntity<Estacion> findById(Long id){

        if (estacionRepository.findById(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(estacionRepository.findById(id)
                    .orElseThrow(() -> new SingleEntityNotFoundException(id.toString(), Estacion.class)));
        }

    }

    public ResponseEntity<Estacion> save(CreateEstacionDto estacion){


            Estacion nueva = estacionDtoConverter.createEstacionDtoToEstacion(estacion);


            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(estacionRepository.save(nueva));


    }

    public ResponseEntity<Estacion> edit(Long id, CreateEstacionDto e){
       return ResponseEntity.of(estacionRepository.findById(id).map(
                m ->{
                    m.setNombre(e.getNombre());
                    m.setMarca(e.getMarca());
                    m.setUbicacion(e.getUbicacion());
                    m.setTieneAutolavado(e.isTieneAutolavado());
                    m.setPrecioGasoilNormal(e.getPrecioGasoilNormal());
                    m.setPrecioGasolina95Octanos(e.getPrecioGasolina95Octanos());
                    m.setPrecioGasoilEspecial(e.getPrecioGasoilEspecial());
                    m.setPrecioGasolina98(e.getPrecioGasolina98());
                    m.setServicios(e.getServicios());
                    m.setFechaApertura(e.getFechaApertura());
                    estacionRepository.save(m);

                    return m;
                })
       );


    }

    public ResponseEntity<?> delete(Long id){
        estacionRepository.deleteById(id);
        return ResponseEntity.status(204).build();
    }





}
