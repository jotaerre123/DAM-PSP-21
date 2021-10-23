package com.salesianostriana.dam.ejercicio1.repos;

import com.salesianostriana.dam.ejercicio1.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
