package com.techsolution.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_cliente;
	
	@Column(name="dui_cliente", unique = true)
	private String dui_cliente;

	@Column(name="nombre_cliente")
	private String nombre_cliente;
	
	@Column(name="apellido_cliente")
	private String apellido_cliente;
	
	@Column(name="telefono_cliente")
	private String telefono_cliente;
	
	@Column(name="correo_cliente")
	private String correo_cliente;
	
	@Column(name="edad_cliente")
	private Integer edad_cliente;
	
	@Column(name="direccion_cliente")
	private String direccion_cliente;
	
	
	public Cliente() {
		
	}


	public long getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(long id_cliente) {
		this.id_cliente = id_cliente;
	}


	public String getDui_cliente() {
		return dui_cliente;
	}


	public void setDui_cliente(String dui_cliente) {
		this.dui_cliente = dui_cliente;
	}


	public String getNombre_cliente() {
		return nombre_cliente;
	}


	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}


	public String getApellido_cliente() {
		return apellido_cliente;
	}


	public void setApellido_cliente(String apellido_cliente) {
		this.apellido_cliente = apellido_cliente;
	}


	public String getTelefono_cliente() {
		return telefono_cliente;
	}


	public void setTelefono_cliente(String telefono_cliente) {
		this.telefono_cliente = telefono_cliente;
	}


	public String getCorreo_cliente() {
		return correo_cliente;
	}


	public void setCorreo_cliente(String correo_cliente) {
		this.correo_cliente = correo_cliente;
	}


	public Number getEdad_cliente() {
		return edad_cliente;
	}


	public void setEdad_cliente(Integer edad_cliente) {
		this.edad_cliente = edad_cliente;
	}


	public String getDireccion_cliente() {
		return direccion_cliente;
	}


	public void setDireccion_cliente(String direccion_cliente) {
		this.direccion_cliente = direccion_cliente;
	}


	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", dui_cliente=" + dui_cliente + ", nombre_cliente="
				+ nombre_cliente + ", apellido_cliente=" + apellido_cliente + ", telefono_cliente=" + telefono_cliente
				+ ", correo_cliente=" + correo_cliente + ", edad_cliente=" + edad_cliente + ", direccion_cliente="
				+ direccion_cliente + "]";
	}
	
	
	
	
}
