package com.salesianostriana.dam.ejemplo05.repos;

import com.salesianostriana.dam.ejemplo05.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {



}
