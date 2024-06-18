package com.alfredosalazar.controladores;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorUsuarios {
	
	private static ArrayList<String> listaDeUsuarios = new ArrayList<String>();
	
	public ControladorUsuarios() {
		listaDeUsuarios.add("Alex Miller");
		listaDeUsuarios.add("Martha Gómez");
		listaDeUsuarios.add("Alan Morales");
		listaDeUsuarios.add("María González");
	}
	
	@GetMapping("/usuarios") 
	public String desplegarTodos(Model modelo) {
		modelo.addAttribute("titulo", "Lista de usuarios");
		modelo.addAttribute("listaDeUsuarios", listaDeUsuarios);
		return "usuarios.jsp";
	}
}
