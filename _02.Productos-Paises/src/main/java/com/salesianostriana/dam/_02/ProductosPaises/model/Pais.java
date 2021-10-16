package com.salesianostriana.dam._02.ProductosPaises.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

@Entity
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Pais implements Serializable {

    @Id
    private UUID id;

    private String nombre;

    public Pais(){
        id = UUID.randomUUID();
    }
}
