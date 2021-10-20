package com.salesianostriana.dam.ejemplo05.repos;

import com.salesianostriana.dam.ejemplo05.model.Alumno;
import com.salesianostriana.dam.ejemplo05.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

    List<Alumno> findByCurso(Curso curso);

}
