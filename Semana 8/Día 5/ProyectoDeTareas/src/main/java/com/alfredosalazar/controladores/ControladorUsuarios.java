package com.alfredosalazar.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.alfredosalazar.modelos.Usuario;
import com.alfredosalazar.servicios.ServicioUsuario;

import jakarta.servlet.http.HttpSession;

@Controller
public class ControladorUsuarios {
	
	@Autowired
	private final ServicioUsuario servicioUsuario;
	
	private static ArrayList<String> listaDeUsuarios = new ArrayList<String>();
	
	public ControladorUsuarios(ServicioUsuario servicioUsuario) {
		this.servicioUsuario = servicioUsuario;
		listaDeUsuarios.add("Alex Miller");
		listaDeUsuarios.add("Martha Gómez");
		listaDeUsuarios.add("Alan Morales");
		listaDeUsuarios.add("María González");
	}
	
	@GetMapping("/usuarios") 
	public String desplegarTodos(Model modelo) {
		List<Usuario> usuarios = this.servicioUsuario.obtenerTodosLosUsuarios();
		modelo.addAttribute("titulo", "Lista de usuarios");
		modelo.addAttribute("usuarios", usuarios);
		return "usuarios.jsp";
	}
	
	@GetMapping("/formulario/usuario")
	public String desplegarFormularioUsuario() {
		return "formularioUsuario.jsp";
	}
	
	@PostMapping("/agregar/usuario")
	public String procesarAgregarUsuario(@RequestParam("nombre") String nombre,
										 @RequestParam("apellido") String apellido,
										 RedirectAttributes validaciones) {
		boolean huboError = false;
		
		if(nombre.equals("")) {
			validaciones.addFlashAttribute("errorNombre", "Por favor proporciona tu nombre");
			huboError = true;
		}
		
		if(apellido.equals("")) {
			validaciones.addFlashAttribute("errorApellido", "Por favor proporciona tu apellido");
			huboError = true;
		}
		
		if(huboError) {
			return "redirect:/formulario/usuario";
		}
		
		listaDeUsuarios.add(nombre + " " + apellido);
		return "redirect:/usuarios";
	}
	
	@GetMapping("/iniciar/sesion")
	public String desplegarJSPParaSesion() {
		return "sesion.jsp";
	}
	
	@PostMapping("/actualizar/contador")
	public String actualizarContador(HttpSession sesion) {
		Integer contador = (Integer) sesion.getAttribute("contador");
		if(contador == null) {
			sesion.setAttribute("contador", 1);
		}
		else {
			sesion.setAttribute("contador", contador + 1);
		}
		
		// Utilizar este método cuando integremos el Logout
		// sesion.invalidate();
		return "redirect:/iniciar/sesion";
	}
	
}
