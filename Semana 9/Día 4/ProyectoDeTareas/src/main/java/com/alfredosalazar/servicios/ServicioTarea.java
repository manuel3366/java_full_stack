package com.alfredosalazar.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfredosalazar.modelos.Tarea;
import com.alfredosalazar.repositorios.RepositorioTarea;

@Service
public class ServicioTarea {
	@Autowired
	private final RepositorioTarea repositorioTarea;
	
	public ServicioTarea(RepositorioTarea repositorioTarea) {
		this.repositorioTarea = repositorioTarea;
	}
	
	public Tarea insertarTarea(Tarea tareaNueva) {
		return this.repositorioTarea.save(tareaNueva);
	}
}
