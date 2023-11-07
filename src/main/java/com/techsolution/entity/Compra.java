package com.techsolution.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table; 

@Entity
@Table(name="compra")
public class Compra {

	@Id
    @Column(unique = true)
	private String id_compra;
	
	@Column(name="descripcion_compra")
	private String descripcion_compra;
	
	@Column(name="metodo_pago")
	private String metodo_pago;
	
	@ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.LAZY) 
	private Cliente cliente;
	
	
	@OneToMany(cascade = CascadeType.MERGE,fetch = FetchType.LAZY) 
	private List<DetalleCompra> detalleCompra;
	
	public Compra() {
		
	}

	public String getId_compra() {
		return id_compra;
	}

	public void setId_compra(String id_compra) {
		this.id_compra = id_compra;
	}

	public String getDescripcion_compra() {
		return descripcion_compra;
	}

	public void setDescripcion_compra(String descripcion_compra) {
		this.descripcion_compra = descripcion_compra;
	}

	public String getMetodo_pago() {
		return metodo_pago;
	}

	public void setMetodo_pago(String metodo_pago) {
		this.metodo_pago = metodo_pago;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<DetalleCompra> getDetalleCompra() {
		return detalleCompra;
	}

	public void setDetalleCompra(List<DetalleCompra> detalleCompra) {
		this.detalleCompra = detalleCompra;
	}

	@Override
	public String toString() {
		return "Compra [id_compra=" + id_compra + ", descripcion_compra=" + descripcion_compra + ", metodo_pago="
				+ metodo_pago + ", cliente=" + cliente + ", detalleCompra=" + detalleCompra + "]";
	}

	 
 
	
}
