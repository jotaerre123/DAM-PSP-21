package com.salesianostrina.dam._Monumentos;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monumento/")
@RequiredArgsConstructor
public class MonumentoController {

    private final MonumentoRepository repository;



    //Listar todos los monumentos
    @GetMapping("/")
    public List<Monumento> findAll(){
        return repository.findAll();
    }

    //Listar un monumento por su id
    @GetMapping("/{id}")
    public Monumento findOne(@PathVariable("id") Long id){
        return repository.findById(id).orElse(null);
    }

    //Crear un monumento nuevo
    @PostMapping("/")
    public ResponseEntity<Monumento> create(@RequestBody Monumento monumento){

        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(monumento));
    }

    //Modificar un monumento
    @PutMapping("/{id}")
    public Monumento edit(@RequestBody Monumento monumento, @PathVariable Long id){

        Monumento old = repository.findById(id).orElse(monumento);

        old.setCodeISO(monumento.getCodeISO());
        old.setNameCountry(monumento.getNameCountry());
        old.setNameCity(monumento.getNameCity());
        old.setLatitude(monumento.getLatitude());
        old.setLongitude(monumento.getLongitude());
        old.setName(monumento.getName());
        old.setDescription(monumento.getDescription());
        old.setImage(monumento.getImage());

        return repository.save(old);

    }

    //Eliminar un monumento
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        repository.deleteById(id);
        return  ResponseEntity.noContent().build();
    }




}
