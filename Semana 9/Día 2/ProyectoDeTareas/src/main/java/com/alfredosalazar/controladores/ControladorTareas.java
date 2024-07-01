package com.alfredosalazar.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.alfredosalazar.modelos.Tarea;
import com.alfredosalazar.modelos.Usuario;
import com.alfredosalazar.servicios.ServicioTarea;
import com.alfredosalazar.servicios.ServicioUsuario;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class ControladorTareas {
	@Autowired
	private final ServicioTarea servicioTarea;
	private final ServicioUsuario servicioUsuario;
	
	public ControladorTareas(ServicioTarea servicioTarea, 
							 ServicioUsuario servicioUsuario) {
		this.servicioTarea = servicioTarea;
		this.servicioUsuario = servicioUsuario;
	}
	
	@GetMapping("/formulario/tarea")
	public String desplegarFormularioTarea(@ModelAttribute("tarea") Tarea tarea,
										   Model modelo,
										   HttpSession sesion) {
		if(sesion.getAttribute("id_usuario") == null) {
			return "redirect:/login_registro";
		}
		List<Usuario> usuarios = this.servicioUsuario.obtenerTodosLosUsuarios();
		modelo.addAttribute("usuarios", usuarios);
		return "formularioTarea.jsp";
	}
	
	@PostMapping("/procesar/tarea/nueva")
	public String procesarAgregarTarea(@Valid @ModelAttribute("tarea") Tarea nuevaTarea,
									   BindingResult validaciones,
									   HttpSession sesion) {
		if(validaciones.hasErrors()) {
			return "formularioTarea.jsp";
		}
		Long idUsuario = (Long)sesion.getAttribute("id_usuario");
		Usuario usuarioActual = this.servicioUsuario.obtenerUsuarioPorId(idUsuario);
		nuevaTarea.setUsuario(usuarioActual);
		
		this.servicioTarea.insertarTarea(nuevaTarea);
		return "redirect:/usuarios";
	}
}
