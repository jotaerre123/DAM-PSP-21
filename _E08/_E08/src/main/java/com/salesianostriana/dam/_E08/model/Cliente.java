package com.salesianostriana.dam._E08.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


//Usamos este tipo de herencia para que al consultar en
// la base de datos podaos obtener un listado de clientes
@Entity
@Getter@Setter
@AllArgsConstructor@NoArgsConstructor@SuperBuilder
@DiscriminatorValue("C")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NamedEntityGraph(name = "grafo-cliente-pedidos",
attributeNodes = {
        @NamedAttributeNode("pedidos")
})
public class Cliente implements Serializable {

    public static final String CLIENTE_PEDIDIO = "grafo-cliente-pedido";

    @Id
    @GeneratedValue
    protected Long id;

    protected String nombre;

    protected String apellidos;

    private String mail;

    //Usamos asociación bidireccional para poder usar las entidades derivadas
    @OneToMany(mappedBy = "cliente")
    protected List<Pedido> pedidos;





}
