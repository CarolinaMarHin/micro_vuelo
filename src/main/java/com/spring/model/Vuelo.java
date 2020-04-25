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
@Table(name = "vuelo")
public class Vuelo {

	@Id	
	@Column(name = "idVuelo")
	private int idVuelo;

	@Column(name = "origen")
	private String origen;
	
	@Column(name = "destino")
	private String destino;
	
	@Column(name = "fechaSalida")
	private Date fechaSalida;
	
	@Column(name = "fechaLlegada")
	private Date fechaLlegada;
		
	public int getIdVuelo() {
		return idVuelo;
	}

	@OneToMany(mappedBy="ListaPasajeros", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<ListaPasajeros> listaPasajerosVuelo(){
		return this.listaPasajerosVuelo();
	};
	
	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}
	
	public String getOrigen() {
		return origen;
	}
	
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public Date getFechaSalida() {
		return fechaSalida;
	}
	
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	
	public Date getFechaLlegada() {
		return fechaLlegada;
	}
	
	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}
	
	public Vuelo() {
	}	
}
