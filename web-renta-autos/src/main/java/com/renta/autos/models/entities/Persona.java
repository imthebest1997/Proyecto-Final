package com.renta.autos.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Persona implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "cedula")	
	private String cedula;

	@Column(name = "nombre")	
	private String nombre;
	
	@Column(name = "telefono")	
	private String telefono;
	
	@Column(name = "celular")	
	private String celular;
	
	@Column(name = "correoElectronico")	
	private String correoElectronico;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

}
