package com.salesianostriana.dam.ejemplo05;

import com.salesianostriana.dam.ejemplo05.model.Alumno;
import com.salesianostriana.dam.ejemplo05.repos.AlumnoRepository;
import com.salesianostriana.dam.ejemplo05.service.AlumnoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainPrueba {


    private final AlumnoService service;



    @PostConstruct
    public void test(){
        Alumno alumno = Alumno.builder()
                .nombre("jaime")
                .apellidos("jimndedfuvñc")
                .email("dovhnñjvnz@")
                .build();
        service.save(alumno);

        service.findAll()
                .forEach(a -> System.out.printf("%s %s\n", a.getNombre(), a.getApellidos()));

    }

}
