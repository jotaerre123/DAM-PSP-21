package com.salesianostriana.dam.E06Ej2;

import com.salesianostriana.dam.E06Ej2.model.CursoOnline;
import com.salesianostriana.dam.E06Ej2.model.Profesor;
import com.salesianostriana.dam.E06Ej2.model.Video;
import com.salesianostriana.dam.E06Ej2.service.CursoOnlineService;
import com.salesianostriana.dam.E06Ej2.service.ProfesorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final ProfesorService profesorService;
    private final CursoOnlineService cursoOnlineService;

    @PostConstruct
    public void prueba(){
        Profesor luisMiguel = Profesor.builder()
                .nombre("Luis Miguel")
                .email("luismiguel@salesianos.com")
                .puntuacion(10)
                .build();
        profesorService.save(luisMiguel);

        Profesor miguel = Profesor.builder()
                .nombre("Miguel")
                .email("miguel@salesianos.com")
                .puntuacion(10)
                .build();
        profesorService.save(miguel);

        ///////////////////////////////////////////////////

        CursoOnline java = CursoOnline.builder()
                .nombre("Java 8")
                .puntuacion(5)
                .videos(new ArrayList<>())
                .build();
        cursoOnlineService.save(java);

        CursoOnline figma = CursoOnline.builder()
                .nombre("Figma")
                .puntuacion(5)
                .videos(new ArrayList<>())
                .build();
        cursoOnlineService.save(figma);

        ///////////////////////////////////////////////////

        java.addVideo(Video.builder()
                        .orden(1)
                        .titulo("Introducción a Java 8")
                        .descripcion("Tremendo video")
                        .url("http://Java/8.com")
                .build());
        cursoOnlineService.edit(java);

        figma.addVideo(Video.builder()
                .orden(1)
                .titulo("Introducción a Figma")
                .descripcion("Tremendo video")
                .url("http://Figma.com")
                .build());
        cursoOnlineService.edit(figma);

        ///////////////////////////////////////////////////

        java.addProfesor(luisMiguel);
        figma.addProfesor(miguel);

        cursoOnlineService.edit(java);
        cursoOnlineService.edit(figma);

        List<CursoOnline> resultado = cursoOnlineService.findAll();

        System.out.println("Profesor: " + luisMiguel.getNombre());
        System.out.println("Cursos: ");
        luisMiguel.getCursoOnline().forEach(c -> {
            System.out.println(c.getNombre());
        });

        System.out.println("Videos: ");
        java.getVideos().forEach(v -> {
            System.out.println(v.getTitulo());
        });


        System.out.println("Profesor: " + miguel.getNombre());
        System.out.println("Cursos: ");
        miguel.getCursoOnline().forEach(c -> {
            System.out.println(c.getNombre());
        });

        System.out.println("Videos: ");
        figma.getVideos().forEach(v -> {
            System.out.println(v.getTitulo());
        });



    }

}
