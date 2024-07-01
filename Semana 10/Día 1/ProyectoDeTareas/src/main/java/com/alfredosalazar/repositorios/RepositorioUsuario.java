package com.alfredosalazar.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alfredosalazar.modelos.Usuario;

@Repository
public interface RepositorioUsuario extends CrudRepository<Usuario, Long> {
	/*
	 * SELECT *
	 * FROM usuarios;
	 */
	List<Usuario> findAll();
	
	Usuario findByCorreo(String correo);
}
