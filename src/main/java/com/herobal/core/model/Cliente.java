package com.herobal.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Cliente;
	
	@Column(name = "cliente")
	private String cliente;
	
	@Column(name = "dni")
	private String dni;

	public Cliente() {
		super();
	}

	public Cliente(int id_Cliente, String cliente, String dni) {
		super();
		this.id_Cliente = id_Cliente;
		this.cliente = cliente;
		this.dni = dni;
	}

	public int getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
}
