package com.salesianostriana.dam.ejemplo05;

import com.salesianostriana.dam.ejemplo05.model.Alumno;
import com.salesianostriana.dam.ejemplo05.repos.AlumnoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainPrueba {


    private final AlumnoRepository repository;



    @PostConstruct
    public void test(){
        Alumno alumno = Alumno.builder()
                .nombre("jaime")
                .apellidos("jimndedfuvñc")
                .email("dovhnñjvnz@")
                .build();
        repository.save(alumno);

        repository.findAll()
                .forEach(System.out::println);

    }

}
