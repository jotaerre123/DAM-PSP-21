package com.salesianostriana.dam.ejercicio1.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Producto {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private double pvp;

    @ManyToOne
    @JoinColumn(name = "categoria", foreignKey = @ForeignKey(name = "FK_PRODUCTO_CATEGORIA"))
    private Categoria categoria;




    public void addCategoria(Categoria c){
        this.categoria = c;
        if (c.getProducto() == null)
            c.setProducto(new ArrayList<>());
        c.getProducto().add(this);
    }
    public void removeCategoria(Categoria c) {
        c.getProducto().remove(this);
        this.categoria = null;
    }

}
