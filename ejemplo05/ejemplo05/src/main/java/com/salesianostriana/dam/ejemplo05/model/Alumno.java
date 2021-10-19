package com.salesianostriana.dam.ejemplo05.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Getter @Setter @EqualsAndHashCode
@Data
public  class Alumno implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre, apellidos , email;

    @ManyToOne
    //@JoinColumn(name = "curso", foreignKey = @ForeignKey(name = "FK_ALUMNO_CURSO"))
    private Curso curso;

    public void addCurso(Curso c){
        this.curso = c;
        c.getAlumnos().add(this);
    }

    public void removeCurso(Curso c){

        c.getAlumnos().remove(this);
        this.curso=null;
    }




}
