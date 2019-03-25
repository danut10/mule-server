package com.cegeka.mule.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cegeka.mule.server.domain.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
