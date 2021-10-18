package com.salesianostriana.dam.ejemplo05.service.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

//R es el tipo del repositorio (Alumno, Factura, etc)
// T(tipo de la entidad) e ID(Long, UUID, Integer)
//Esta clase se utiliza para no usar directamente los repositorios o controladores
public abstract class BaseService<T, ID, R extends JpaRepository<T, ID>>{

    @Autowired
   protected R repositorio;


    public List<T> findAll(){
        return repositorio.findAll();
    }

    public Optional<T> findById(ID id){
        return repositorio.findById(id);
    }

    public T save(T t){
        return repositorio.save(t);
    }

    public T edit(T t){
        return save(t);
    }

    public void delete(T t){
        repositorio.delete(t);
    }

    public void deleteById(ID id){
        repositorio.deleteById(id);
    }
}
