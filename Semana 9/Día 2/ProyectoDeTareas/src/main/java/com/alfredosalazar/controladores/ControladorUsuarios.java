package com.alfredosalazar.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.alfredosalazar.modelos.Usuario;
import com.alfredosalazar.servicios.ServicioUsuario;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

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
	public String desplegarFormularioUsuario(@ModelAttribute("usuario") Usuario nuevoUsuario) {
		return "formularioUsuario.jsp";
	}
	
	@PostMapping("/registrar/usuario")
	public String procesarAgregarUsuario(@Valid @ModelAttribute("usuario") Usuario nuevoUsuario,
										 BindingResult validaciones) {
		if(validaciones.hasErrors()) {
			return "formularioUsuario.jsp";
		}
		this.servicioUsuario.insertarUsuario(nuevoUsuario);
		return "redirect:/usuarios";
	}
	
	@DeleteMapping("/eliminar/usuario/{id}")
	public String procesarEliminarUsuario(@PathVariable("id") Long id) {
		this.servicioUsuario.eliminarUsuario(id);
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
	
	@GetMapping("/formulario/editar/usuario/{id}")
	public String desplegarFormularioEditarUsuario(@ModelAttribute("usuario") Usuario usuario,
												   @PathVariable("id") Long id,
												   Model modelo) {
		Usuario usuarioExistente = this.servicioUsuario.obtenerUsuarioPorId(id);
		// Validar si el usuario existe
		modelo.addAttribute("usuario", usuarioExistente);
		return "formularioEditarUsuario.jsp";
	}
	
	@PutMapping("/procesar/editar/usuario/{id}")
	public String procesarEditarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario,
										BindingResult validaciones,
										@PathVariable("id") Long id) {
		if(validaciones.hasErrors()) {
			return "formularioEditarUsuario.jsp";
		}
		usuario.setId(id);
		this.servicioUsuario.actualizarUsuario(usuario);
		return "redirect:/usuarios";
	}
	
	@GetMapping("/tareas/usuario/{id}")
	public String desplegarUsuarioConTareas(@PathVariable("id") Long id,
											Model modelo) {
		Usuario usuario = this.servicioUsuario.obtenerUsuarioPorId(id);
		modelo.addAttribute("usuario", usuario);
		return "detalleUsuario.jsp";
	}	
	
}
