package com.salesianostriana.dam.ejemplo05.service;

import com.salesianostriana.dam.ejemplo05.model.Asignatura;
import com.salesianostriana.dam.ejemplo05.repos.AsignaturaRepository;
import com.salesianostriana.dam.ejemplo05.service.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsignaturaService  extends BaseService<Asignatura, Long, AsignaturaRepository> {

    public List<Asignatura> saveAll(Iterable<Asignatura> list) {
        return this.repositorio.saveAll(list);
    }

}
