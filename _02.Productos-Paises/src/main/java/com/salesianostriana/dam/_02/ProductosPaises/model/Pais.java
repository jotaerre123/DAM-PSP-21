package com.salesianostriana.dam._02.ProductosPaises.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "country")
public class Pais implements Serializable {

    @Id
    private int id;


    @Column(name = "name", nullable = false, length = 128)
    private String nombre;



}
