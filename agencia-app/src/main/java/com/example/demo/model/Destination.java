package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "destination")
public class Destination {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name = "destination")
	private String destination1;
	@NotNull
	@Column(name = "date")
	private String date;
	@NotNull
	@Column(name = "duration")
	private String duration;

	public Destination() {
		
	}

	public Destination(Long id, String destination1, String date, String duration) {
		super();
		this.id = id;
		this.destination1 = destination1;
		this.date = date;
		this.duration = duration;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDestination1() {
		return destination1;
	}

	public void setDestination1(String destination1) {
		this.destination1 = destination1;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
}
