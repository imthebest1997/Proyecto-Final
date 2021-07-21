package com.renta.autos.models.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "detalle_mantenimiento")
public class DetalleMantenimiento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "codigo_det")
	private Integer idDetalleMantenimiento;//Atributo que se mapea con la Primary Key

	@Column(name = "nombre_det")
	private String nombre;
	
	@Column(name = "descripcion_det")
	private String descripcion;

	@JoinColumn(name= "fk_manteniento",referencedColumnName = "codigo_man") // Se mapea con una clave foranea
	@ManyToOne
	private Mantenimiento mantenimiento;

	
	
	public DetalleMantenimiento(Integer idDetalleMantenimiento) {
		super();
		this.idDetalleMantenimiento = idDetalleMantenimiento;
	}

	public DetalleMantenimiento() {
		super();
	}
}
