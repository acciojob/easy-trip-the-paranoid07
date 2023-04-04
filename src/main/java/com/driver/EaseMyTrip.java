package com.driver;

import com.driver.controllers.AirportController;
import com.driver.model.Airport;
import com.driver.model.City;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EaseMyTrip {

	public static void main(String[] args) {

		SpringApplication.run(EaseMyTrip.class, args);
		Airport airport=new Airport("kanpur airpot",4,City.KANPUR);
		AirportController airportController=new AirportController();
		airportController.addAirport(airport);
	}

}
