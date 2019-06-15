package com.NRJPVTLTD.Bike.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.NRJPVTLTD.Bike.models.Bike;
import com.NRJPVTLTD.Bike.repositories.BikeRepository;

@RestController
@RequestMapping("/api/ver1/bike")
public class BikeController {

	@Autowired
	private BikeRepository bikeRepository;
	
	@GetMapping
	public List<Bike> list(){
		
//		List<Bike> bikes = new ArrayList<Bike>(); // without repository
//		return bikes;
		return bikeRepository.findAll();
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Bike bike) {
		//adding for with repository
		bikeRepository.save(bike);
	}
	
	@GetMapping("/{id}")
	public Bike get(@PathVariable("id") long id) {
		//return new Bike(); w/o repository
		return bikeRepository.getOne(id);
	}
	
}
