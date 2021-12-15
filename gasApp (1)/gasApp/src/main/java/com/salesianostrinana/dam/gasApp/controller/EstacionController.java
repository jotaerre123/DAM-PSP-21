package com.salesianostrinana.dam.gasApp.controller;

import com.salesianostrinana.dam.gasApp.dto.CreateEstacionDto;
import com.salesianostrinana.dam.gasApp.model.Estacion;
import com.salesianostrinana.dam.gasApp.services.EstacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/estacion")
public class EstacionController {

    private final EstacionService estacionService;

    @GetMapping("/")
    public ResponseEntity<List<Estacion>> all(){
        return estacionService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estacion> findOne(@PathVariable("id") Long id){
        return estacionService.findById(id);
    }


    @PostMapping("/")
    public ResponseEntity<Estacion> create(@Valid @RequestBody CreateEstacionDto estacion){
        return estacionService.save(estacion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estacion> edit(@Valid @RequestBody CreateEstacionDto estacion, @PathVariable("id") Long id){
        return estacionService.edit(id, estacion);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){

        return estacionService.delete(id);
    }
}
