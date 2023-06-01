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
@Table(name = "boleta")
public class Boleta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id_Boleta;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private Cliente id_cliente;
	
	@Column(name = "fecha")
	private String fecha;
	
	public Boleta() {
		// TODO Auto-generated constructor stub
	}

	public Boleta(String id_Boleta, Cliente id_cliente, String fecha) {
		super();
		this.id_Boleta = id_Boleta;
		this.id_cliente = id_cliente;
		this.fecha = fecha;
	}

	public String getId_Boleta() {
		return id_Boleta;
	}

	public void setId_Boleta(String id_Boleta) {
		this.id_Boleta = id_Boleta;
	}

	public Cliente getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Cliente id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}
