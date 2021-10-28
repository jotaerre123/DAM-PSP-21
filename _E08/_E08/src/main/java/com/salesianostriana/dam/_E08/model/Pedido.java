package com.salesianostriana.dam._E08.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@EntityListeners(AuditingEntityListener.class)
public class Pedido {

    @Id
    @GeneratedValue
    private Long id;

    @CreatedDate
    private LocalDateTime fechaLlegada;

    @Lob
    private String descripcion;

    private String transporte;

    @ManyToOne
    private Cliente cliente;

    public void addCliente(Cliente c){
        this.cliente = c;
        if (c.getPedidos() == null){
            c.setPedidos(new ArrayList<>());
            c.getPedidos().add(this);
        }
    }

    public void removeCliente(Cliente c){
        this.cliente = null;

        c.getPedidos().remove(this);
    }
}
