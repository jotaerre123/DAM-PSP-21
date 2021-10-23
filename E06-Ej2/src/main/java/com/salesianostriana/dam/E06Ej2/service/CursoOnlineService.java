package com.salesianostriana.dam.E06Ej2.service;

import com.salesianostriana.dam.E06Ej2.model.CursoOnline;
import com.salesianostriana.dam.E06Ej2.repos.CursoOnlineRepository;
import com.salesianostriana.dam.E06Ej2.service.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoOnlineService extends BaseService<CursoOnline, Long, CursoOnlineRepository> {

    @Override
    public List<CursoOnline> findAll(){
        return this.repositorio.findAllJoin();
    }

}
