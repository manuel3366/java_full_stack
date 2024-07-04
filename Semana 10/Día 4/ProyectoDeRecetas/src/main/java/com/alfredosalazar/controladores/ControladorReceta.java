package com.alfredosalazar.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.alfredosalazar.modelos.Receta;
import com.alfredosalazar.modelos.Usuario;
import com.alfredosalazar.servicios.ServicioReceta;
import com.alfredosalazar.servicios.ServicioUsuario;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class ControladorReceta {
	@Autowired
	private final ServicioReceta servicioReceta;
	private final ServicioUsuario servicioUsuario;
	
	public ControladorReceta(ServicioReceta servicioReceta, ServicioUsuario servicioUsuario) {
		this.servicioReceta = servicioReceta;
		this.servicioUsuario = servicioUsuario;
	}
	

	@GetMapping("/recetas")
	public String desplegarRecetas(Model modelo,
								   HttpSession sesion) {
		if(sesion.getAttribute("id_usuario") == null) {
			return "redirect:/login";
		}
		
		List<Receta> recetas = this.servicioReceta.obtenerTodas();
		modelo.addAttribute("recetas", recetas);
		
		return "recetas.jsp";
	}
	
	@GetMapping("/nueva/receta")
	public String desplegarFormularioReceta(@ModelAttribute("receta") Receta receta,
											HttpSession sesion) {
		if(sesion.getAttribute("id_usuario") == null) {
			return "redirect:/login";
		}
		return "formularioReceta.jsp";
	}
	
	@PostMapping("/agregar/receta")
	public String procesarAgregarReceta(@Valid @ModelAttribute("receta") Receta receta,
										BindingResult validaciones,
										HttpSession sesion) {
		if(validaciones.hasErrors()) {
			return "formularioReceta.jsp";
		}
		Long idUsuario = (Long)sesion.getAttribute("id_usuario");
		Usuario usuario = this.servicioUsuario.obtenerPorId(idUsuario);
		receta.setUsuario(usuario);
		
		this.servicioReceta.insertarReceta(receta);
		
		return "redirect:/recetas";
	} 
	
	@GetMapping("/detalle/receta/{id}")
	public String desplegarReceta(@PathVariable("id") Long id,
								  HttpSession sesion,
								  Model modelo) {
		if(sesion.getAttribute("id_usuario") == null) {
			return "redirect:/login";
		}
		Receta receta = this.servicioReceta.obtenerPorId(id);
		modelo.addAttribute("receta", receta);
		
		return "detalleReceta.jsp";
	}
	
	@GetMapping("/eliminar/receta/{id}")
	public String eliminarReceta(@PathVariable("id") Long id) {
		this.servicioReceta.eliminarPorId(id);
		return "redirect:/recetas";
	}
	
	@GetMapping("/editar/receta/{id}")
	public String desplegarEditarFormularioReceta(@ModelAttribute("receta") Receta receta,
												  @PathVariable("id") Long id,
												  Model modelo,
												  HttpSession sesion) {
		if(sesion.getAttribute("id_usuario") == null) {
			return "redirect:/login";
		}
		receta = this.servicioReceta.obtenerPorId(id);
		modelo.addAttribute("receta", receta);
		return "formularioEditarReceta.jsp";
	}
	
	@PutMapping("/procesar/editar/receta/{id}")
	public String procesaEditarReceta(@Valid @ModelAttribute("receta") Receta receta,
									  BindingResult validaciones,
									  @PathVariable("id") Long id,
									  HttpSession sesion) {
		if(validaciones.hasErrors()) {
			return "formularioEditarReceta.jsp";
		}
		Long idUsuario = (Long)sesion.getAttribute("id_usuario");
		Usuario usuario = this.servicioUsuario.obtenerPorId(idUsuario);
		receta.setId(id);
		receta.setUsuario(usuario);
		this.servicioReceta.actualizarReceta(receta);
		return "redirect:/recetas";
	}
	
	@GetMapping("/logout")
	public String procesaLogount(HttpSession sesion) {
		sesion.invalidate();
		return "redirect:/login";
	}
	
}
