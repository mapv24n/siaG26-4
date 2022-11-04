package com.example.demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TripulanteControlador {
	
	@GetMapping("/gesTrip")
	public String gesTripulante() {
		return "/admin/trip/index";
	}
	
	@GetMapping("/addTrip")
	public String addTripulante() {
		return "/admin/trip/addTrip";
	}

}
