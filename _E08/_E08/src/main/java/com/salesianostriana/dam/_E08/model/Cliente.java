package com.salesianostriana.dam._E08.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;


//Usamos este tipo de herencia para que al consultar en
// la base de datos podaos obtener un listado de clientes
@Entity
@Getter@Setter
@AllArgsConstructor@NoArgsConstructor@SuperBuilder
public class Cliente {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private String apellidos;

    private String mail;

    //Usamos asociación bidireccional para poder usar las entidades derivadas
    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;





}
