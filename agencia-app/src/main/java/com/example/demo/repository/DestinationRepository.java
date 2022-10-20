package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Destination;

public interface DestinationRepository extends JpaRepository<Destination, Long> {
	
}