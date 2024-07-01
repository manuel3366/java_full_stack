package com.alfredosalazar.servicios;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfredosalazar.modelos.LoginUsuario;
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
		String contraseñaEncriptada = BCrypt.hashpw(nuevoUsuario.getContraseña(), BCrypt.gensalt());
		nuevoUsuario.setContraseña(contraseñaEncriptada);
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
	
	public Usuario obtenerUsuarioPorEmailYContraseña(LoginUsuario loginUsuario) {
		Usuario usuarioActual = this.repositorioUsuario.findByCorreo(loginUsuario.getUsuarioCorreo());
		if(BCrypt.checkpw(loginUsuario.getUsuarioContraseña(), usuarioActual.getContraseña())) {
			return usuarioActual;
		}
		else {
			return null;
		}
	}
	
}
