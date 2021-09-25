package com.salesianostrina.dam._Monumentos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data@NoArgsConstructor@AllArgsConstructor
public class Monumento {

    @Id
    @GeneratedValue
    private Long id;

    private String codeISO;

    private String nameCountry;

    private String nameCity;

    private double latitude;

    private double longitude;

    private String name;

    private String description;

    private String image;

    public Monumento(String codeISO, String nameCountry, String nameCity, double latitude,
                     double longitude, String name, String description, String image) {
        this.codeISO = codeISO;
        this.nameCountry = nameCountry;
        this.nameCity = nameCity;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.description = description;
        this.image = image;
    }
}
