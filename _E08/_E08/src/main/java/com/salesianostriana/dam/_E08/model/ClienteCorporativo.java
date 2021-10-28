package com.salesianostriana.dam._E08.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@DiscriminatorValue("CC")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ClienteCorporativo extends Cliente{

    private double capitalEmpresa;

    @ManyToOne
    private Empleado empleado;


    public void addEmpleado(Empleado e){
        this.empleado = e;
        if (e.getClienteCorporativos() == null){
            e.setClienteCorporativos(new ArrayList<>());
            e.getClienteCorporativos().add(this);
        }
    }

    public void removeEmpleado(Empleado e){

        e.getClienteCorporativos().remove(this);
        this.empleado = null;
    }

}
