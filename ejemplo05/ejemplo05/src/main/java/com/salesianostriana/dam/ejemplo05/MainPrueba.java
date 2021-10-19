package com.salesianostriana.dam.ejemplo05;

import com.salesianostriana.dam.ejemplo05.model.Alumno;
import com.salesianostriana.dam.ejemplo05.model.Curso;
import com.salesianostriana.dam.ejemplo05.repos.AlumnoRepository;
import com.salesianostriana.dam.ejemplo05.service.AlumnoService;
import com.salesianostriana.dam.ejemplo05.service.CursoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Component
@RequiredArgsConstructor
public class MainPrueba {


    private final AlumnoService service;
    private final CursoService cursoService;


    @PostConstruct
    public void test(){

        Curso dam2 = Curso.builder()
                .nombre("dam2")
                .tutor("Luismi")
                .alumnos(new ArrayList<>())
                .build();

        cursoService.save(dam2);


        Alumno alumno = Alumno.builder()
                .nombre("jaime")
                .apellidos("jimndedfuvñc")
                .email("dovhnñjvnz@")
                //.curso(dam2)
                .build();

        alumno.addCurso(dam2);

        service.save(alumno);

        service.findAll()
                .forEach(a -> System.out.printf("%s %s\n", a.getNombre(), a.getApellidos()));

        System.out.println("nº de alumnos = "+ dam2.getAlumnos().size());
        alumno.removeCurso(dam2);

    }

}
