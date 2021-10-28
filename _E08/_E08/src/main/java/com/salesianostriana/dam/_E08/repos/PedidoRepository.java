package com.salesianostriana.dam._E08.repos;

import com.salesianostriana.dam._E08.model.ClienteCorporativo;
import com.salesianostriana.dam._E08.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
