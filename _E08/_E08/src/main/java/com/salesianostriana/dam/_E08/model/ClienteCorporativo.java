package com.salesianostriana.dam._E08.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.ArrayList;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
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
        this.empleado = null;
        e.getClienteCorporativos().remove(this);
    }

}
