package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.model.Pasajero;

public interface PasajerosRepository extends JpaRepository<Pasajero, Integer>{
	
	@Query("Select new com.spring.model.Pasajero(idPasajero, nombre, apellido, edad, correo) from Pasajero where idPasajero=:id")
	Pasajero pasajeroById(Integer id);
}
