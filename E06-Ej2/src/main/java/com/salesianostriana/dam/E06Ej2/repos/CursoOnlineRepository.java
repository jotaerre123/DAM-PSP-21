package com.salesianostriana.dam.E06Ej2.repos;

import com.salesianostriana.dam.E06Ej2.model.CursoOnline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CursoOnlineRepository extends JpaRepository<CursoOnline, Long> {

    @Query("select distinct c from CursoOnline c join fetch c.videos")
    List<CursoOnline> findAllJoin();

}
