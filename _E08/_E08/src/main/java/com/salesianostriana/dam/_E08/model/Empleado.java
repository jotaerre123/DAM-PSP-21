package com.salesianostriana.dam._E08.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empleado {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private String apellidos;

    private String empresa;

    private String nacionalidad;


    //Usamos asociación bidireccional para poder usar las entidades derivadas
    @OneToMany(mappedBy = "empleado")
    private List<ClienteCorporativo> clienteCorporativos;

}
