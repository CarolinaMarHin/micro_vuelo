package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Vuelo;

public interface VuelosRepository extends JpaRepository<Vuelo, Integer>{
	
}
