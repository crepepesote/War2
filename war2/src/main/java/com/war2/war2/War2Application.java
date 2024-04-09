package com.war2.war2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class War2Application {

	public static void main(String[] args) {
		SpringApplication.run(War2Application.class, args);
	}

	@GetMapping("/saludo")
	public String saludar() {
		return "¡Hola! Bienvenido a mi aplicación.";
	}
}
