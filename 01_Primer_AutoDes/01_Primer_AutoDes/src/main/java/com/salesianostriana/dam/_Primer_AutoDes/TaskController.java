package com.salesianostriana.dam._Primer_AutoDes;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Equivalente a @Controller + @ResponseBody
@RequestMapping("/task/")
@RequiredArgsConstructor
public class TaskController {

    private final TaskRepository repository;

    @GetMapping("/")
    public List<Task> findAll(){
        return repository.findAll();
    }

    @PostMapping("/")
    public ResponseEntity <Task> create(@RequestBody Task task){



        return ResponseEntity.status(HttpStatus.CREATED)
                .body(repository.save(task));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
        //return ResponseEntity.status(204).build();
        //Comentario de Vicente: en el task antiguo la 2 maneras de borrar

    }

    @GetMapping("/{id}")
    public Task findOne(@PathVariable("id") Long id){
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Task edit(@RequestBody Task task, @PathVariable Long id){

        Task antigua = repository.findById(id).orElse(task);
        antigua.setText(task.getText());
        antigua.setTitle(task.getTitle());

        return repository.save(antigua);


    }

}
