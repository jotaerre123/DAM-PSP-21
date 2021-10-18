package com.salesianostriana.dam._02.ProductosPaises.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "country")
public class Pais implements Serializable {

    @Id
    private UUID id;


    @Column(name = "name", nullable = true)
    private String nombre;


    public Pais(){
        id = UUID.randomUUID();
    }
}
