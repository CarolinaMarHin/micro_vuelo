package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.model.ListaPasajeros;
import com.spring.model.Pasajero;

public interface ListaPasajerosRepository extends JpaRepository<Pasajero, Integer> {

	@Query(value = "Select Pasajero.id_Pasajero, Pasajero.nombre, Pasajero.apellido, Pasajero.edad, Pasajero.correo from Pasajero INNER JOIN ListaPasajeros ON ListaPasajeros.id_Pasajero=Pasajero.id_Pasajero where ListaPasajeros.id_Vuelo=:idVuelo", nativeQuery = true)
	List<Pasajero> pasajerosVuelo(Integer idVuelo);
}
