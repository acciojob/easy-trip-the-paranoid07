package com.driver;

import com.driver.controllers.AirportController;
import com.driver.model.Airport;
import com.driver.model.City;
import com.driver.model.Flight;
import com.driver.model.Passenger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class EaseMyTrip {

	public static void main(String[] args) {

		SpringApplication.run(EaseMyTrip.class, args);

//		AirportController airportController=new AirportController();
//
//		Airport airport=new Airport("kanpur airport",4,City.KANPUR);
//		Airport airport1=new Airport("bangaore airport",5,City.BANGLORE);
//		System.out.println(airportController.addAirport(airport));
//		airportController.addAirport(airport1);
//
//		Flight flight=new Flight(1,City.KANPUR,City.BANGLORE,50, new Date(20/04/2023),4.5);
//		Flight flight1=new Flight(2,City.BANGLORE,City.KANPUR,40,new Date(20/04/2023),5.5);
//		System.out.println(airportController.addFlight(flight));
//		airportController.addFlight(flight1);
//
//		Passenger passenger1=new Passenger(789,"hello@123","Acio",23);
//		Passenger passenger2=new Passenger(987,"hello@456","Acio",25);
//		Passenger passenger3=new Passenger(543,"hello@789","Acio",24);
//		System.out.println(airportController.addPassenger(passenger1));
//
//		airportController.addPassenger(passenger2);
//		airportController.addPassenger(passenger3);
//
//		System.out.println(airportController.bookATicket(1,789));
//		airportController.bookATicket(1,937);
//		airportController.bookATicket(1,543);
//		airportController.bookATicket(2,937);
//		airportController.bookATicket(2,543);
//		airportController.bookATicket(2,789);
//
//		System.out.println(airportController.getNumberOfPeopleOn(new Date(20/04/2023),"kanpur airport"));


	}

}
