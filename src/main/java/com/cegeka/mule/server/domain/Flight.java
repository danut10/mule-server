package com.cegeka.mule.server.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity 
@Data
public class Flight {

	public Flight() {}
	
	public Flight(String flightNo, Date flightDate) {
		this.flightNo = flightNo;
		this.flightDate = flightDate;
	}
	
	@Id @GeneratedValue
	private Integer id;
	private String flightNo;
	private Date flightDate;
	
	
}
