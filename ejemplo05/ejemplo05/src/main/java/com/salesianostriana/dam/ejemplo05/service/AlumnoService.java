package com.salesianostriana.dam.ejemplo05.service;
//Para separar paquetes cambiar la ruta


import com.salesianostriana.dam.ejemplo05.model.Alumno;
import com.salesianostriana.dam.ejemplo05.repos.AlumnoRepository;
import com.salesianostriana.dam.ejemplo05.service.base.BaseService;
import net.bytebuddy.TypeCache;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService extends BaseService<Alumno, Long, AlumnoRepository> {



}
