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
@Table(name = "product")
public class Producto implements Serializable {

  @Id
  private UUID id;


  @Column(name = "name", nullable = true)
  private String nombre;

  @Column(name = "price", nullable = true)
  private double precio;


  @Column(name = "image", nullable = true)
  private String imagen;

  @Lob
  @Column(name = "description", nullable = true)
  private String descripcion;

  public Producto(){
      id = UUID.randomUUID();
  }

}
