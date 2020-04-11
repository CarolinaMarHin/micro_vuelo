package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Pasajero;
import com.spring.model.Vuelo;
import com.spring.repository.PasajerosRepository;
import com.spring.repository.VuelosRepository;

@RestController
public class MicroVueloRest {
	
	@Autowired
	private VuelosRepository vueloRepository;
	
	@Autowired
	private PasajerosRepository pasajerosRepository;
	
	@GetMapping("/listavuelos")
	public List<Vuelo> listarVuelo(){
		return vueloRepository.findAll();
	}
	
	@GetMapping("/pasajero")
	public Pasajero pasajero(@RequestParam(name="id") Integer id){
		return pasajerosRepository.pasajeroById(id);
	}

	@GetMapping("/listapasajeros")
	public List<Pasajero> listarPasajeros(){
		return pasajerosRepository.findAll();
	}
	
	@PostMapping("/agregarpasajero")
	public void insertar(@RequestBody Pasajero pasajero){
		pasajerosRepository.save(pasajero);
	}

	@PutMapping("/actualizarpasajero")
	public void modificar(@RequestBody Pasajero pasajero){
		pasajerosRepository.save(pasajero);
	}

	@DeleteMapping(value = "/eliminarpasajero/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		pasajerosRepository.deleteById(id);
	}
}