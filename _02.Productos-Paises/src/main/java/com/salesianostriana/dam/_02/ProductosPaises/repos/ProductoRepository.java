package com.salesianostriana.dam._02.ProductosPaises.repos;

import com.salesianostriana.dam._02.ProductosPaises.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductoRepository extends JpaRepository<Producto, UUID> {
}
