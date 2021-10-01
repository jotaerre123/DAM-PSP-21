package com.salesianostrina.dam._Monumentos;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Version;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(description = "ejemplo", version = "1.0", license = @License(name = "lisensia"), contact = @Contact(email = "jaimejimenezrios10@gmail.com", name = "Jaime"),
title = "Monumentos mamalongos"))
public class MonumentosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonumentosApplication.class, args);
	}

}
