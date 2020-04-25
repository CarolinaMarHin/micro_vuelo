package com.spring.model;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pasajero")
public class Pasajero {
	
	@Id	
	@Column(name = "idPasajero")
	private int idPasajero;

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "edad")
	private String edad;
	
	@Column(name = "correo")
	private String correo;
	
	@OneToMany(mappedBy="ListaPasajeros", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<ListaPasajeros> listaVuelos(){
		return this.listaVuelos();
	};
	
	public int getIdPasajero() {
		return idPasajero;
	}

	public void setIdPasajero(int idPasajero) {
		this.idPasajero = idPasajero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Pasajero() {
		
	}

	public Pasajero(int idPasajero, String nombre, String apellido, String edad, String correo) {
		this.idPasajero = idPasajero;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.correo = correo;
	}
	
}
