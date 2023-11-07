package com.techsolution.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

 
@Entity
@Table(name="detalle_compra")
public class DetalleCompra {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_detalle_compra;

	@Column(name = "cantidad_compra")
	private int cantidad_compra;

	@Column(name = "precio _compra")
	private float precio_compra;
	
	@Column(name="impuesto_compra")
	private float impuesto_compra;
	
	@Column(name="descuento_compra")
	private float descuento_compra;
	
	@OneToMany(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
	private List<Producto> producto;
	
	@OneToMany(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
	private List<Servicio> servicio;
	
	public DetalleCompra() {
		
	}

	public long getId_detalle_compra() {
		return id_detalle_compra;
	}

	public void setId_detalle_compra(long id_detalle_compra) {
		this.id_detalle_compra = id_detalle_compra;
	}

	public int getCantidad_compra() {
		return cantidad_compra;
	}

	public void setCantidad_compra(int cantidad_compra) {
		this.cantidad_compra = cantidad_compra;
	}

	public float getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(float precio_compra) {
		this.precio_compra = precio_compra;
	}

	public float getImpuesto_compra() {
		return impuesto_compra;
	}

	public void setImpuesto_compra(float impuesto_compra) {
		this.impuesto_compra = impuesto_compra;
	}

	public float getDescuento_compra() {
		return descuento_compra;
	}

	public void setDescuento_compra(float descuento_compra) {
		this.descuento_compra = descuento_compra;
	}

	 

	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}

	public List<Servicio> getServicio() {
		return servicio;
	}

	public void setServicio(List<Servicio> servicio) {
		this.servicio = servicio;
	}

	@Override
	public String toString() {
		return "DetalleCompra [id_detalle_compra=" + id_detalle_compra + ", cantidad_compra=" + cantidad_compra
				+ ", precio_compra=" + precio_compra + ", impuesto_compra=" + impuesto_compra + ", descuento_compra="
				+ descuento_compra + ", producto=" + producto + ", servicio=" + servicio + "]";
	}

 
	
}
