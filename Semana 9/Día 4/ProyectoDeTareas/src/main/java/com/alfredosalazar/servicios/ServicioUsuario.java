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
		//return this.repositorioUsuario.findAll();
		//return this.repositorioUsuario.selectAllFromUsuarios();
		return this.repositorioUsuario.seleccionarTodosLosUsuarios();
	}
	
	public void insertarUsuario(Usuario nuevoUsuario) {
		// return this.repositorioUsuario.save(nuevoUsuario);
		System.out.println("INSERT con query nativo!!!");
		this.repositorioUsuario.insertUsuario(nuevoUsuario.getNombre(), 
											  nuevoUsuario.getApellido(),
											  nuevoUsuario.getCorreo(),
											  nuevoUsuario.getContraseña());
	}
	
	public void eliminarUsuario(Long id) {
		// this.repositorioUsuario.deleteById(id);
		this.repositorioUsuario.eliminarUnUsuario(id);
	}
	
	public Usuario obtenerUsuarioPorId(Long id) {
		return this.repositorioUsuario.findById(id).orElse(null);
	}
	
	public int actualizarUsuario(Usuario usuario) {
		//return this.repositorioUsuario.save(usuario);
		return this.repositorioUsuario.updateUsuario(usuario.getNombre(),
													 usuario.getApellido(),
													 usuario.getCorreo(),
													 usuario.getContraseña(),
													 usuario.getId());

	}
	
}
