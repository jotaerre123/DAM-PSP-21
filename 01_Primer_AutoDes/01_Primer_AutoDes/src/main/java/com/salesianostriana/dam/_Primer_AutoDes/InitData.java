package com.salesianostriana.dam._Primer_AutoDes;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class InitData {

    private final TaskRepository repository;


    @PostConstruct
    public void init(){

        repository.saveAll(
                Arrays.asList(
                        new Task("Rellenar initdata", "llenar de datos el bicho")

                )
        );

    }

}
