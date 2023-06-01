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
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProducto;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "precio")
	private double precio;
	
	@Column(name = "stock")
	private int stock;
	
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private Categoria id_categoria;
	
	@ManyToOne
	@JoinColumn(name = "id_marca")
	private Marca id_marca;
	
	@Column(name = "fechaCreacion")
	private String fechaCreacion;
	
	@Column(name = "fechaVencimiento")
	private String fechaVencimiento;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(int idProducto, String nombre, String descripcion, double precio, int stock, Categoria id_categoria,
			Marca id_marca, String fechaCreacion, String fechaVencimiento) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.id_categoria = id_categoria;
		this.id_marca = id_marca;
		this.fechaCreacion = fechaCreacion;
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Categoria getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Categoria id_categoria) {
		this.id_categoria = id_categoria;
	}

	public Marca getId_marca() {
		return id_marca;
	}

	public void setId_marca(Marca id_marca) {
		this.id_marca = id_marca;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
}
