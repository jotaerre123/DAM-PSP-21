package com.salesianostriana.dam.ejemplo05.repos;

import com.salesianostriana.dam.ejemplo05.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
