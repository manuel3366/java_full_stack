package com.alfredosalazar.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alfredosalazar.modelos.Receta;

@Repository
public interface RepositorioReceta extends CrudRepository<Receta, Long> {
	List<Receta> findAll();
}
