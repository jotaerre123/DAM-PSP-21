package com.salesianostriana.dam._E07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class E07Application {

	public static void main(String[] args) {
		SpringApplication.run(E07Application.class, args);
	}

}
