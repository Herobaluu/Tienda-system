package com.herobal.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "boleta_detalle")
public class Boleta_Detalle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Boleta_Detalle;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private Boleta id_Boleta;

	@ManyToOne
	@JoinColumn(name = "id")
	private Producto id_Producto;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name = "precio")
	private double precio;
	
	public Boleta_Detalle() {
		// TODO Auto-generated constructor stub
	}

	public Boleta_Detalle(int id_Boleta_Detalle, Boleta id_Boleta, Producto id_Producto, int cantidad, double precio) {
		super();
		this.id_Boleta_Detalle = id_Boleta_Detalle;
		this.id_Boleta = id_Boleta;
		this.id_Producto = id_Producto;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public int getId_Boleta_Detalle() {
		return id_Boleta_Detalle;
	}

	public void setId_Boleta_Detalle(int id_Boleta_Detalle) {
		this.id_Boleta_Detalle = id_Boleta_Detalle;
	}

	public Boleta getId_Boleta() {
		return id_Boleta;
	}

	public void setId_Boleta(Boleta id_Boleta) {
		this.id_Boleta = id_Boleta;
	}

	public Producto getId_Producto() {
		return id_Producto;
	}

	public void setId_Producto(Producto id_Producto) {
		this.id_Producto = id_Producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
