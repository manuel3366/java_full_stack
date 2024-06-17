package com.alfredosalazar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class ProyectoDeTareasApplication {

	/* http://localhost:8080 */
	public static void main(String[] args) {
		SpringApplication.run(ProyectoDeTareasApplication.class, args);
	}
	
	@GetMapping("/inicio")
	public String desplegarInicio() {
		return "<h1> Hola desde nuestra primera aplicación en Spring </h1>";
	}
	
	@GetMapping("/mensaje/{nombre}/{apellido}")
	public String desplegarMensaje(@PathVariable("nombre") String nombre,
								   @PathVariable("apellido") String apellido) {
		return "<h1> Bienvenido de vuelta " + nombre + " " + apellido + "</h1>"; 
	}
}
