package com.salesianostriana.dam.ejercicio1;

import com.salesianostriana.dam.ejercicio1.model.Categoria;
import com.salesianostriana.dam.ejercicio1.model.Producto;
import com.salesianostriana.dam.ejercicio1.service.CategoriaService;
import com.salesianostriana.dam.ejercicio1.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final ProductoService productoService;
    private final CategoriaService categoriaService;

    @PostConstruct
    public void test(){


        Categoria categoria = Categoria.builder()
                .nombre("Juguete")
                .build();

        categoriaService.save(categoria);

        Producto producto = Producto.builder()
                .nombre("Peluche Peppo")
                .pvp(50.00)
                .build();

        productoService.save(producto);
        producto.addCategoria(categoria);


        System.out.println("Categoria " +categoria.getNombre());
        System.out.println("Producto " +producto.getNombre());

    }



}
