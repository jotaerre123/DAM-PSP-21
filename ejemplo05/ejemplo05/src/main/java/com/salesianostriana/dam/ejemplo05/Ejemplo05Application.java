package com.salesianostriana.dam.ejemplo05;

import com.salesianostriana.dam.ejemplo05.model.Alumno;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ejemplo05Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejemplo05Application.class, args);
	}


	/*@Bean
	public CommandLineRunner test(){
		return args -> {
			Alumno alumno = Alumno.builder()
					.nombre("jaime")
					.apellidos("jimenez rios")
					.email("jaimejimenezrios10@gmail.com")
					.build();
		};
	}*/

}
