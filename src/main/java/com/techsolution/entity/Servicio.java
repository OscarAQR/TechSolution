package com.techsolution.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="servicio")
public class Servicio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_servicio;
	
	@Column(name = "nombre_servicio")
	private String nombre_servicio;
	
	@Column(name = "descripcion_servicio")
	private String descripcion_servicio;
	
	@Column(name = "precio_servicio")
	private float precio_servicio;
	
	@Column(name = "fecha_ingreso_servicio")
	private String fecha_ingreso_servicio;
	
	@ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER) 
	private Cliente cliente;
	
	public Servicio() {
		// TODO Auto-generated constructor stub
	}

	public long getId_servicio() {
		return id_servicio;
	}

	public void setId_servicio(long id_servicio) {
		this.id_servicio = id_servicio;
	}

	public String getNombre_servicio() {
		return nombre_servicio;
	}

	public void setNombre_servicio(String nombre_servicio) {
		this.nombre_servicio = nombre_servicio;
	}

	public String getDescripcion_servicio() {
		return descripcion_servicio;
	}

	public void setDescripcion_servicio(String descripcion_servicio) {
		this.descripcion_servicio = descripcion_servicio;
	}

	public float getPrecio_servicio() {
		return precio_servicio;
	}

	public void setPrecio_servicio(float precio_servicio) {
		this.precio_servicio = precio_servicio;
	}

	public String getFecha_ingreso_servicio() {
		return fecha_ingreso_servicio;
	}

	public void setFecha_ingreso_servicio(String fecha_ingreso_servicio) {
		this.fecha_ingreso_servicio = fecha_ingreso_servicio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Servicio [id_servicio=" + id_servicio + ", nombre_servicio=" + nombre_servicio
				+ ", descripcion_servicio=" + descripcion_servicio + ", precio_servicio=" + precio_servicio
				+ ", fecha_ingreso_servicio=" + fecha_ingreso_servicio + ", cliente=" + cliente + "]";
	}
	
	
	
	
	
}

