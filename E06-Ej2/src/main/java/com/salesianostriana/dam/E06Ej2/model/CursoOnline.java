package com.salesianostriana.dam.E06Ej2.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
@Builder
public class CursoOnline {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private double puntuacion;

    @ManyToOne
    @JoinColumn(name = "profesor", foreignKey = @ForeignKey(name = "FK_CURSOONLINE_PROFESOR"))
    private Profesor profesor;

    @OneToMany(mappedBy = "cursoOnline", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Video> videos = new ArrayList<>();

    //Helpers


    public void addVideo(Video v){
        v.setCursoOnline(this);
        videos.add(v);
    }

    public void removeVideo(Video v){
        videos.remove(v);
        v.setCursoOnline(null);
    }


    public void addProfesor(Profesor p){
        profesor = p;
        if (p.getCursoOnline() == null){
            p.setCursoOnline(new ArrayList<>());
            p.getCursoOnline().add(this);
        }
    }

    public void removeProfesor(Profesor p){
        p.getCursoOnline().remove(this);
        profesor = null;
    }


}
