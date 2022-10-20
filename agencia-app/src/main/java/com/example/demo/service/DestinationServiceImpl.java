package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Destination;
import com.example.demo.repository.DestinationRepository;

@Service
public class DestinationServiceImpl implements DestinationService{

	private DestinationRepository destinationRepository;
	
	public DestinationServiceImpl(DestinationRepository destinationRepository) {
		super();
		this.destinationRepository = destinationRepository;
	}

	@Override
	public List<Destination> getAllDestinations() {
		return destinationRepository.findAll();
	}

	@Override
	public Destination saveDestination(Destination destination) {
		return destinationRepository.save(destination);
	}

	@Override
	public Destination getDestinationById(Long id) {
		return destinationRepository.findById(id).get();
	}

	@Override
	public Destination updateDestination(Destination destination) {
		return destinationRepository.save(destination);
	}

	@Override
	public void deleteDestinationById(Long id) {
		destinationRepository.deleteById(id);	
	}
}