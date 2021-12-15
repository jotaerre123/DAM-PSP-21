package com.salesianostrinana.dam.gasApp.repos;

import com.salesianostrinana.dam.gasApp.model.Estacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstacionRepository extends JpaRepository<Estacion, Long> {

    boolean existsByNombre(String rotulo);

}
