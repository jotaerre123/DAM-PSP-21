package com.salesianostrinana.dam.gasApp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Estacion {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "{estacion.nombre.null}")
    @NotBlank(message = "{estacion.nombre.blank}")
    private String nombre;


    private String marca;

    @NotNull(message = "{estacion.ubicacion.null}")
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
