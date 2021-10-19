package com.salesianostriana.dam.ejemplo05.service;

import com.salesianostriana.dam.ejemplo05.model.Curso;
import com.salesianostriana.dam.ejemplo05.repos.CursoRepository;
import com.salesianostriana.dam.ejemplo05.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CursoService extends BaseService<Curso, Long, CursoRepository> {
}