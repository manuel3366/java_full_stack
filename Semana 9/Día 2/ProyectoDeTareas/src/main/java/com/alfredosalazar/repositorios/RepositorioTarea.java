package com.alfredosalazar.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alfredosalazar.modelos.Tarea;

@Repository
public interface RepositorioTarea extends CrudRepository<Tarea, Long>{
	List<Tarea> findAll();
}
