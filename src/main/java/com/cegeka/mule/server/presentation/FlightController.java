package com.cegeka.mule.server.presentation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cegeka.mule.server.dao.FlightRepository;
import com.cegeka.mule.server.domain.Flight;

@RestController
public class FlightController {

	@Autowired
	FlightRepository flightDao;

	@SuppressWarnings("deprecation")
	@GetMapping("/fligths")
	List<Flight> readList() {
		List<Flight> flightList = new ArrayList<>();
		flightList.add(new Flight("00123", new Date(119, 3, 23)));
		flightList.add(new Flight("00124", new Date(119, 3, 24)));
		flightList.add(new Flight("00125", new Date(119, 3, 25)));
		flightList.add(new Flight("00126", new Date(119, 3, 26)));
		return flightList;
	}
	
	@GetMapping("/fligth/{id}")
	Flight read(@PathVariable Integer id) {
		
		
		Flight flight = new Flight();
		flight.setId(id);
		return flight;
	}
}
