package com.salesianostrinana.dam.gasApp.services;

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

    public ResponseEntity<List<Estacion>> findAll(){
        List<Estacion> result = estacionRepository.findAll();

        if (result.isEmpty()){
            throw new ListEntityNotFoundException(Estacion.class);
        }else{
            return ResponseEntity.ok(result);
        }
    }

    public ResponseEntity<Estacion> findById(Long id){

        return ResponseEntity.ok(estacionRepository.findById(id)
                .orElseThrow(() -> new SingleEntityNotFoundException(id.toString(), Estacion.class)));
    }

    public ResponseEntity<Estacion> save(Estacion estacion){

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(estacionRepository.save(estacion));
    }

    public ResponseEntity<Estacion> edit(Long id, Estacion e){
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





}
