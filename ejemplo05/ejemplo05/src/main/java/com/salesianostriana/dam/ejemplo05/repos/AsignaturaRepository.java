package com.salesianostriana.dam.ejemplo05.repos;

import com.salesianostriana.dam.ejemplo05.model.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsignaturaRepository  extends JpaRepository<Asignatura, Long> {
}
