package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Destination;

public interface DestinationService {
	List<Destination> getAllDestinations();
	
	Destination saveDestination(Destination destination);
	
	Destination getDestinationById(Long id);
	
	Destination updateDestination(Destination destination);
	
	void deleteDestinationById(Long id);
}