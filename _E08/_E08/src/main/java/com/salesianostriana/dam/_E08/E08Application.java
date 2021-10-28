package com.salesianostriana.dam._E08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class E08Application {

	public static void main(String[] args) {
		SpringApplication.run(E08Application.class, args);
	}

}
