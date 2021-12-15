package com.salesianostrinana.dam.gasApp.dto;

import com.salesianostrinana.dam.gasApp.model.Estacion;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class EstacionDtoConverter {

    public Estacion createEstacionDtoToEstacion(CreateEstacionDto e){
        return new Estacion(
                e.getNombre(),
                e.getMarca(),
                e.getUbicacion(),
                e.isTieneAutolavado(),
                e.getPrecioGasoilNormal(),
                e.getPrecioGasolina95Octanos(),
                e.getPrecioGasoilEspecial(),
                e.getPrecioGasolina98(),
                e.getServicios(),
                e.getFechaApertura(),
                e.getFechaRegistro()
        );
    }

}
