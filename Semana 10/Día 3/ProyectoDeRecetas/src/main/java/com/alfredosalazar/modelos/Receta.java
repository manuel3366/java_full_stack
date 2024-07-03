package com.alfredosalazar.modelos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="recetas")
public class Receta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Por favor proporciona el nombre de la receta.")
	@Size(min=3, message="Por favor proporciona el nombre de la receta.")
	private String nombre;
	
	@NotBlank(message="Por favor proporciona la descripción de la receta.")
	@Size(min=3, message="Por favor proporciona la descripción de la receta.")
	private String descripcion;
	
	@NotBlank(message="Por favor proporciona las instrucciones.")
	@Size(min=3, message="Por favor proporciona las instrucciones.")
	private String instrucciones;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fechaCoccion;
	
	private Integer menosDe30;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_actualizacion")
	private Date fechaActualizacion;
	
	@PrePersist
	protected void onCreate() {
		this.fechaCreacion = new Date();
		this.fechaActualizacion = this.fechaCreacion;
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.fechaActualizacion = new Date();
	}
	
	public Receta() {}
	
	public String fechaConFormato() {
		String patron = "MMMM dd, yyyy";
		Locale loc = new Locale("es", "MX");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patron, loc);
		String fechaNueva = simpleDateFormat.format(this.fechaCoccion);
		return fechaNueva;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getInstrucciones() {
		return instrucciones;
	}

	public void setInstrucciones(String instrucciones) {
		this.instrucciones = instrucciones;
	}

	public Date getFechaCoccion() {
		return fechaCoccion;
	}

	public void setFechaCoccion(Date fechaCoccion) {
		this.fechaCoccion = fechaCoccion;
	}

	public Integer getMenosDe30() {
		return menosDe30;
	}

	public void setMenosDe30(Integer menosDe30) {
		this.menosDe30 = menosDe30;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
}
