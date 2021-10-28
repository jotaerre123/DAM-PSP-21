package com.salesianostriana.dam._E08.repos;

import com.salesianostriana.dam._E08.model.Cliente;
import com.salesianostriana.dam._E08.model.ClienteCorporativo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {



}
