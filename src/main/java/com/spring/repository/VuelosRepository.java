package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.model.Pasajero;
import com.spring.model.Vuelo;

public interface VuelosRepository extends JpaRepository<Vuelo, Integer>{
}
