package com.salesianostrinana.dam.gasApp.dto;

import lombok.*;

import javax.persistence.Lob;
import javax.validation.constraints.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateEstacionDto {

    private Long id;


    @NotBlank(message = "{estacion.nombre.blank}")
    private String nombre;


    private String marca;


    @NotBlank(message = "{estacion.ubicacion.blank}")
    private String ubicacion;


    private boolean tieneAutolavado;

    @Min(value = 0, message = "{estacion.precioGasoilNormal.min}")
    @Positive
    private double precioGasoilNormal;

    @Min(value = 0, message = "{estacion.precioGasolina95Octanos.min}")
    @Positive
    private double precioGasolina95Octanos;

    @Min(value = 0, message = "{estacion.precioGasoilEspecial.min}")
    @Positive
    private double precioGasoilEspecial;

    @Min(value = 0, message = "{estacion.precioGasolina98.min}")
    @Positive
    private double precioGasolina98;

    @Lob
    private String servicios;

    @Past
    private LocalDateTime fechaApertura;



}
