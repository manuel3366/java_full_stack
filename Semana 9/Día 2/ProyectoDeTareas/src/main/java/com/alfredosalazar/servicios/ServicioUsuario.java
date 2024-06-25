package com.alfredosalazar.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfredosalazar.modelos.Usuario;
import com.alfredosalazar.repositorios.RepositorioUsuario;

@Service
public class ServicioUsuario {
	@Autowired
	private final RepositorioUsuario repositorioUsuario;
	
	public ServicioUsuario(RepositorioUsuario repositorioUsuario) {
		this.repositorioUsuario = repositorioUsuario;
	}
	
	public List<Usuario> obtenerTodosLosUsuarios(){
		return this.repositorioUsuario.findAll();
	}
	
	public Usuario insertarUsuario(Usuario nuevoUsuario) {
		return this.repositorioUsuario.save(nuevoUsuario);
	}
	
	public void eliminarUsuario(Long id) {
		this.repositorioUsuario.deleteById(id);
	}
	
	public Usuario obtenerUsuarioPorId(Long id) {
		return this.repositorioUsuario.findById(id).orElse(null);
	}
	
	public Usuario actualizarUsuario(Usuario usuario) {
		return this.repositorioUsuario.save(usuario);
	}
	
}
