package com.salesianostriana.dam.ejercicio1.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor@AllArgsConstructor
@Getter@Setter
@Builder
public class Categoria {

    @Id
    @GeneratedValue
   private Long id;

   private String nombre;

   @Builder.Default
   @OneToMany(mappedBy = "categoria")
   private List<Producto> producto = new ArrayList<>();






}
