package edu.cajerojpa.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


@Entity(name="BancoEntity")
@Table (name="banco")
public class BancoEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
    @Column(name="id")
	private int id;
	
	@NotNull
	@NotEmpty
	@Column(name="nit")
	private String nit;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="telefono")
	private String telefono;
	
	public BancoEntity() {
	}

	public BancoEntity(int id, String nit, String nombre, String telefono) {
		super();
		this.id = id;
		this.nit = nit;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
