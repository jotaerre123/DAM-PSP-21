package com.salesianostrina.dam._Monumentos;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class InitData {

    private final MonumentoRepository repository;


    @PostConstruct
    public void init(){

        repository.saveAll(
                Arrays.asList(
                     new Monumento("IN", "India", "Agra", 27.174167, 78.042222, "Taj Mahal", "Es un símbolo de amor", "https://viajes.nationalgeographic.com.es/medio/2015/02/22/hemis_1718519_500x330.jpg"),
                        new Monumento("FR", "Francia", "París", 48.858296,  2.294479, "Torre Eiffel", "Símbolo de la modernidad y la tecnología a finales del siglo XIX", "https://viajes.nationalgeographic.com.es/medio/2015/02/22/hemis_2053661_500x332.jpg"),
                        new Monumento("ES", "España", "Granada", 37.176335, -3.588213, "La Alhambra de Granada", "Los palacios de la Alhambra están rodeados por un laberinto de estanques, fuentes y jardines inundados con el perfume de madreselvas y jazmines.", "https://viajes.nationalgeographic.com.es/medio/2015/02/22/hemis_0520700_500x332.jpg")

                        )
        );

    }

}
