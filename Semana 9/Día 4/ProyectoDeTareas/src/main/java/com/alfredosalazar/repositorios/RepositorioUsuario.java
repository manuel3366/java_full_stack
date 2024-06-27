package com.alfredosalazar.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.alfredosalazar.modelos.Usuario;

@Repository
public interface RepositorioUsuario extends CrudRepository<Usuario, Long> {
	/*
	 * SELECT *
	 * FROM usuarios;
	 */
	List<Usuario> findAll(); // JPA
	
	// GET
	@Query("SELECT u FROM Usuario u")
	List<Usuario> selectAllFromUsuarios();
	
	@Query(value="SELECT * FROM usuarios", nativeQuery=true)
	List<Usuario> seleccionarTodosLosUsuarios();
	
	
	// DELETE
	@Transactional
	@Modifying
	@Query("DELETE FROM Usuario u WHERE u.id = ?1") // JPQL
	void deleteFromUsuarios(Long id);

	@Transactional
	@Modifying
	@Query(value="DELETE FROM usuarios WHERE id = ?1", nativeQuery=true) // SQL
	void eliminarUnUsuario(Long id);
	
	// UPDATE
	@Transactional
	@Modifying
	@Query(value="UPDATE usuarios SET nombre=?1, apellido=?2, correo=?3, contraseña=?4 WHERE id=?5", nativeQuery = true)
	int updateUsuario(String nombre, // 1
					  String apellido,  // 2
					  String correo,  // 3
					  String contraseña,  // 4
					  Long id); // 5
	
	// INSERT
	@Transactional
	@Modifying
	@Query(value="INSERT INTO usuarios(nombre, apellido, correo, contraseña) "
				+ "VALUES(?1, ?2, ?3, ?4)", nativeQuery = true)
	void insertUsuario(String nombre, String apellido, String correo, String contraseña);
}
