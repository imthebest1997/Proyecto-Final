package com.renta.autos.models.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "mantenimiento")
public class Mantenimiento implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "codigo_man")
	private Integer codigoMantenimiento;//Atributo que se mapea con la Primary Key

	@Column(name = "fecha_inicio_man")
	private Calendar fechaInicio;

	@Column(name = "fecha_fin_man")
	private Calendar fechaFin;

	//mappedBy va el nombre del atributo de esta clase en la clase asociada
	
	@OneToMany(mappedBy = "mantenimiento", fetch = FetchType.LAZY)
	private List<DetalleMantenimiento> detalleMantenimiento;
	
	@JoinColumn(name= "fk_automovil",referencedColumnName = "codigo_aut") // Se mapea con una clave foranea
//	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	private Automovil automovil;
	
	public Mantenimiento(Integer codigoMantenimiento) {
		super();
		this.codigoMantenimiento = codigoMantenimiento;
	}	

	public Mantenimiento() {
		super();
	}

	public Integer getCodigoMantenimiento() {
		return codigoMantenimiento;
	}

	public void setCodigoMantenimiento(Integer codigoMantenimiento) {
		this.codigoMantenimiento = codigoMantenimiento;
	}

	public Calendar getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Calendar fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Calendar getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Calendar fechaFin) {
		this.fechaFin = fechaFin;
	}


	public List<DetalleMantenimiento> getDetalleMantenimiento() {
		return detalleMantenimiento;
	}


	public void setDetalleMantenimiento(List<DetalleMantenimiento> detalleMantenimiento) {
		this.detalleMantenimiento = detalleMantenimiento;
	}
	
	//Si el decorador JsonIgnore es quitado, automaticamente no se visualiza los autos
	@JsonIgnore
	public Automovil getAutomovil() {
		return automovil;
	}
	
	@JsonProperty(access = Access.WRITE_ONLY)
	public void setAutomovil(Automovil automovil) {
		this.automovil = automovil;
	}	
}
