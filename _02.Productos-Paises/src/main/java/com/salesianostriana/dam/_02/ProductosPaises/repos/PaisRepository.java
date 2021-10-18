package com.salesianostriana.dam._02.ProductosPaises.repos;

import com.salesianostriana.dam._02.ProductosPaises.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaisRepository extends JpaRepository<Pais, Integer> {
}
