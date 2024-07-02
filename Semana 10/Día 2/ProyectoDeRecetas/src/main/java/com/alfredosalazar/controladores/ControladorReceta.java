package com.alfredosalazar.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class ControladorReceta {

	@GetMapping("/recetas")
	public String desplegarRecetas(Model modelo,
								   HttpSession sesion) {
		if(sesion.getAttribute("id_usuario") == null) {
			return "redirect:/login";
		}
		// Cargar lista de recetas al Modelo
		return "recetas.jsp";
	}
}
