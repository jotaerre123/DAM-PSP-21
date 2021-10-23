package com.salesianostriana.dam.ejercicio1.service;

import com.salesianostriana.dam.ejercicio1.model.Producto;
import com.salesianostriana.dam.ejercicio1.repos.ProductoRepository;
import com.salesianostriana.dam.ejercicio1.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProductoService extends BaseService<Producto, Long, ProductoRepository> {
}
