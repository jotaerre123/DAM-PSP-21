package com.salesianostrinana.dam.gasApp.dto;

import com.salesianostrinana.dam.gasApp.validacion.anotaciones.DateComparison;
import com.salesianostrinana.dam.gasApp.validacion.anotaciones.LocationValueMatch;
import com.salesianostrinana.dam.gasApp.validacion.anotaciones.UniqueName;
import lombok.*;

import javax.persistence.Lob;
import javax.validation.constraints.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@LocationValueMatch.List({
        @LocationValueMatch(
                ubicacion = "ubicacion",
                message = "{estacion.ubicacion.pattern}"
        )
})
@DateComparison(
        fechaApertura = "fechaApertura",
        fechaRegistro = "fechaRegistro",
        message = "{estacion.fecha.comparison}"
)
public class CreateEstacionDto {

    private Long id;


    @NotBlank(message = "{estacion.nombre.blank}")
    @UniqueName(message = "{estacion.nombre.unico}")
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

    private LocalDateTime fechaRegistro= LocalDateTime.now();



}
