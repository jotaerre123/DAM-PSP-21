package com.salesianostriana.dam._E08.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@NamedEntityGraph(
        name = Empleado.EMPLEADO_CLIENTE_CORP,
        attributeNodes = {
                @NamedAttributeNode("clienteCorporativos")
        }
)
public class Empleado implements Serializable {


    public static final String EMPLEADO_CLIENTE_CORP = "grafo-empleado-clienteCorporativos";

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private String apellidos;

    private String empresa;

    private String nacionalidad;


    //Usamos asociación bidireccional para poder usar las entidades derivadas
    
    @OneToMany(mappedBy = "empleado")
    private List<ClienteCorporativo> clienteCorporativos = new ArrayList<>();

}
