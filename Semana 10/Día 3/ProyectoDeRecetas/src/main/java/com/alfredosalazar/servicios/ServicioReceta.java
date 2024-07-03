package com.alfredosalazar.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfredosalazar.modelos.Receta;
import com.alfredosalazar.repositorios.RepositorioReceta;

@Service
public class ServicioReceta {
	@Autowired
	private final RepositorioReceta repositorioReceta;
	
	public ServicioReceta(RepositorioReceta repositorioReceta) {
		this.repositorioReceta = repositorioReceta;
	}
	
	public Receta insertarReceta(Receta nuevaReceta) {
		return this.repositorioReceta.save(nuevaReceta);
	}
	
	public List<Receta> obtenerTodas(){
		return this.repositorioReceta.findAll();
	}
	
	public Receta obtenerPorId(Long id) {
		return this.repositorioReceta.findById(id).orElse(null);
	}
}
