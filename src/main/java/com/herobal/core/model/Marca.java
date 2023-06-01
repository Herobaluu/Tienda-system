package com.herobal.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marca")
public class Marca {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Marca;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	public Marca() {
		// TODO Auto-generated constructor stub
	}

	public Marca(int id_Marca, String nombre, String descripcion) {
		super();
		this.id_Marca = id_Marca;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getId_Marca() {
		return id_Marca;
	}

	public void setId_Marca(int id_Marca) {
		this.id_Marca = id_Marca;
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
	
}
