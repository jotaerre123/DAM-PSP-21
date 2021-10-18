package com.salesianostriana.dam._02.ProductosPaises.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "product")
public class Producto implements Serializable {

  @Id
  private int id;


  @Column(name = "name", nullable = false, length = 255)
  private String nombre;

  @Column(name = "price", nullable = false)
  private double precio;


  @Column(name = "image", nullable = false)
  private String imagen;

  @Lob
  @Column(name = "description", nullable = false)
  private String descripcion;


}
