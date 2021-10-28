package com.salesianostriana.dam._E08.repos;

import com.salesianostriana.dam._E08.model.ClienteCorporativo;
import com.salesianostriana.dam._E08.model.ClienteIndividual;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteIndividualRepository extends JpaRepository<ClienteIndividual, Long> {
}
