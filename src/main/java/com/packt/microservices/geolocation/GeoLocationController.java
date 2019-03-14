package com.packt.microservices.geolocation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/geolocation")
public class GeoLocationController {

	@Autowired
	private GeoLocationService service;

	@PostMapping(produces = "application/json", consumes = "application/json")
	public GeoLocation create(@RequestBody GeoLocation geoLocation) {
		return service.create(geoLocation);
	}

	@GetMapping(produces = "application/json")
	public List<GeoLocation> findAll() {
		return service.findAll();
	}
}
