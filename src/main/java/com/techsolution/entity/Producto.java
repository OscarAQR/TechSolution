package com.techsolution.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_producto;
	
	@Column(name="sku_producto", unique = true)
	private String sku_producto;
	
	@Column(name="nombre_producto")
	private String nombre_producto;
	
	@Column(name="descripcion_producto")
	private String descripcion_producto;
	
	@Column(name="precio_unitario")
	private float precio_unitario;
	
	@Column(name="stock")
	private int stock;
	
	@Column(name="fecha_ingreso_producto")
	private String fecha_ingreso_producto;
	
	@Column(name="imagen_producto")
	private String imagen_producto;
	
	@Column(name="categoria_producto")
	private String categoria_producto;
	
	@Column(name="proveedor_producto")
	private String proveedor_producto;
	
	public Producto() {
		
	}

	public long getId_producto() {
		return id_producto;
	}

	public void setId_producto(long id_producto) {
		this.id_producto = id_producto;
	}

	public String getSku_producto() {
		return sku_producto;
	}

	public void setSku_producto(String sku_producto) {
		this.sku_producto = sku_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public String getDescripcion_producto() {
		return descripcion_producto;
	}

	public void setDescripcion_producto(String descripcion_producto) {
		this.descripcion_producto = descripcion_producto;
	}

	public float getPrecio_unitario() {
		return precio_unitario;
	}

	public void setPrecio_unitario(float precio_unitario) {
		this.precio_unitario = precio_unitario;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getFecha_ingreso_producto() {
		return fecha_ingreso_producto;
	}

	public void setFecha_ingreso_producto(String fecha_ingreso_producto) {
		this.fecha_ingreso_producto = fecha_ingreso_producto;
	}

	public String getImagen_producto() {
		return imagen_producto;
	}

	public void setImagen_producto(String imagen_producto) {
		this.imagen_producto = imagen_producto;
	}

	public String getCategoria_producto() {
		return categoria_producto;
	}

	public void setCategoria_producto(String categoria_producto) {
		this.categoria_producto = categoria_producto;
	}

	public String getProveedor_producto() {
		return proveedor_producto;
	}

	public void setProveedor_producto(String proveedor_producto) {
		this.proveedor_producto = proveedor_producto;
	}

	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", sku_producto=" + sku_producto + ", nombre_producto="
				+ nombre_producto + ", descripcion_producto=" + descripcion_producto + ", precio_unitario="
				+ precio_unitario + ", stock=" + stock + ", fecha_ingreso_producto=" + fecha_ingreso_producto
				+ ", imagen_producto=" + imagen_producto + ", categoria_producto=" + categoria_producto
				+ ", proveedor_producto=" + proveedor_producto + "]";
	}
	
	
	
}
