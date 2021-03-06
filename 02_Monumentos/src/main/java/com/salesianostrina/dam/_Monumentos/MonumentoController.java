package com.salesianostrina.dam._Monumentos;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tags;
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
    public ResponseEntity<List<Monumento>> findAll(){
        return ResponseEntity.ok().body(repository.findAll());
    }


    /*public List<Monumento> findAll(){
        return repository.findAll();
    }*/



    //Listar un monumento por su id
    @Operation(summary = "Obtiene el monumento elegido en base a su ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            description = "Se ha encontrado el monumento",
            content = {@Content(mediaType = "application/json",
            schema = @Schema(implementation = Monumento.class))})
    })
    @ApiResponse(responseCode = "400",
    description = "No se ha encontrado",
    content = @Content)
    @GetMapping("/{id}")
    public ResponseEntity<Monumento> findOne(@PathVariable("id") Long id /* este nombre puede ser cualquier cosa si se pone el pathvariable con ("id")*/){

        return ResponseEntity.of(repository.findById(id));

    }

    /*public Monumento findOne(@PathVariable("id") Long id){
        return repository.findById(id).orElse(null);
    }*/

    //Crear un monumento nuevo
    @PostMapping("/")
    public ResponseEntity<Monumento> create(@RequestBody Monumento monumento){
                                            //requestbody es el cuerpo del mensaje asociado al parametro pedido
        //Si el tipo es de la clase modelo, siempre saldra el codigo 200


        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(monumento));
    }                      //.status(201)

    //Modificar un monumento
    @PutMapping("/{id}")
    public ResponseEntity<Monumento> edit(@RequestBody Monumento monumento, @PathVariable Long id){

        return ResponseEntity.of(

        repository.findById(id).map(m -> {


            m.setCodeISO(monumento.getCodeISO());
            m.setNameCountry(monumento.getNameCountry());
            m.setNameCity(monumento.getNameCity());
            m.setLatitude(monumento.getLatitude());
            m.setLongitude(monumento.getLongitude());
            m.setName(monumento.getName());
            m.setDescription(monumento.getDescription());
            m.setImage(monumento.getImage());
            repository.save(m);
            return m;
        })

        );
    }

    /*public Monumento edit(@RequestBody Monumento monumento, @PathVariable Long id){

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

    }*/

    //Eliminar un monumento
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
                        // ?: podr??a ser cualquier dato, ya que no le importa porque va a borrarlo
        repository.deleteById(id);
        return  ResponseEntity.noContent().build();
    }




}
