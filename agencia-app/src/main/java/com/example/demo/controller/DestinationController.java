package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Destination;
import com.example.demo.service.DestinationService;

@Controller
public class DestinationController {
	
	private DestinationService destinationService;

	public DestinationController(DestinationService destinationService) {
		super();
		this.destinationService = destinationService;
	}
	
	// handler method to handle list students and return mode and view
	@GetMapping("/destinations")
	public String listDestinations(Model model) {
		model.addAttribute("destinations", destinationService.getAllDestinations());
		return "destinations";
	}
	
	@GetMapping("/destinations/new")
	public String createDestinationForm(Model model) {
		
		// create student object to hold student form data
		Destination destination = new Destination();
		model.addAttribute("destination", destination);
		return "create_destination";
		
	}
	
	@PostMapping("/destinations")
	public String saveDestination(@ModelAttribute("destination") Destination destination) {
		destinationService.saveDestination(destination);
		return "redirect:/destinations";
	}
	
	@GetMapping("/destinations/edit/{id}")
	public String editDestinationForm(@PathVariable Long id, Model model) {
		model.addAttribute("destination", destinationService.getDestinationById(id));
		return "edit_destination";
	}

	@PostMapping("/destinations/{id}")
	public String updateDestination(@PathVariable Long id,
			@ModelAttribute("destination") Destination destination,
			Model model) {
		
		// get student from database by id
		Destination existingDestination = destinationService.getDestinationById(id);
		existingDestination.setId(id);
		existingDestination.setDestination1(destination.getDestination1());
		existingDestination.setDate(destination.getDate());
		existingDestination.setDuration(destination.getDuration());
		//existingDestination.setUser(destination.getUser());
		
		// save updated student object
		destinationService.updateDestination(existingDestination);
		return "redirect:/destinations";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/destinations/{id}")
	public String deleteDestination(@PathVariable Long id) {
		destinationService.deleteDestinationById(id);
		return "redirect:/destinations";
	}	
}