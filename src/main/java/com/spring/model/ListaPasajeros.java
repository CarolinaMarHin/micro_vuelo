package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "listapasajeros")
public class ListaPasajeros {
	
	@Id	
	@Column(name = "idLista")
	private int idLista;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_Pasajero")
    private Pasajero pasajero;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_Vuelo")
    private Vuelo vuelo;

	public int getIdLista() {
		return idLista;
	}

	public void setIdLista(int idLista) {
		this.idLista = idLista;
	}


	public ListaPasajeros() {
		
	}

	public ListaPasajeros(int idLista, int idPasajero, int idVuelo) {
		this.idLista = idLista;
	}
	
	
	
}
