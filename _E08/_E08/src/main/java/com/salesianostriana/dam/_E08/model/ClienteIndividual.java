package com.salesianostriana.dam._E08.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@DiscriminatorValue("CI")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ClienteIndividual extends Cliente{

    private String nacionalidad;

    private boolean premium;

}
