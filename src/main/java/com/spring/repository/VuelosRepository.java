package com.spring.repository;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.model.Pasajero;
import com.spring.model.Vuelo;

@Transactional
public interface VuelosRepository extends JpaRepository<Vuelo, Integer>{

	@Modifying
	@Query(value = "Update vuelo SET origen=:origen, destino=:destino, fecha_salida=:fechaSalida, fecha_llegada=:fechaLlegada  WHERE id_vuelo=:idVuelo", nativeQuery = true)
	public void actualizarVuelo(@Param("idVuelo") int idVuelo, @Param("origen") String origen, @Param("destino") String destino, @Param("fechaSalida") String fechaSalida, @Param("fechaLlegada") String fechaLlegada);

}
