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

    private String nombre;


    private String marca;

    private String ubicacion;


    private boolean tieneAutolavado;


    private double precioGasoilNormal;


    private double precioGasolina95Octanos;

    private double precioGasoilEspecial;

    private double precioGasolina98;

    @Lob
    private String servicios;

    private LocalDateTime fechaApertura;

    private LocalDateTime fechaRegistro;


    public Estacion(String nombre, String marca, String ubicacion, boolean tieneAutolavado, double precioGasoilNormal, double precioGasolina95Octanos, double precioGasoilEspecial, double precioGasolina98, String servicios, LocalDateTime fechaApertura) {
        this.nombre = nombre;
        this.marca = marca;
        this.ubicacion = ubicacion;
        this.tieneAutolavado = tieneAutolavado;
        this.precioGasoilNormal = precioGasoilNormal;
        this.precioGasolina95Octanos = precioGasolina95Octanos;
        this.precioGasoilEspecial = precioGasoilEspecial;
        this.precioGasolina98 = precioGasolina98;
        this.servicios = servicios;
        this.fechaApertura = fechaApertura;
    }

    public Estacion(String nombre, String marca, String ubicacion, boolean tieneAutolavado, double precioGasoilNormal, double precioGasolina95Octanos, double precioGasoilEspecial, double precioGasolina98, String servicios, LocalDateTime fechaApertura, LocalDateTime fechaRegistro) {
        this.nombre = nombre;
        this.marca = marca;
        this.ubicacion = ubicacion;
        this.tieneAutolavado = tieneAutolavado;
        this.precioGasoilNormal = precioGasoilNormal;
        this.precioGasolina95Octanos = precioGasolina95Octanos;
        this.precioGasoilEspecial = precioGasoilEspecial;
        this.precioGasolina98 = precioGasolina98;
        this.servicios = servicios;
        this.fechaApertura = fechaApertura;
        this.fechaRegistro = LocalDateTime.now();
    }

}
