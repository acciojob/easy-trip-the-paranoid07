package com.driver.Repositories;

import com.driver.model.Airport;
import com.driver.model.City;
import com.driver.model.Flight;
import com.driver.model.Passenger;
import com.driver.service_layer.AirportService;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
@Repository
public class AirportRepository {

    HashMap<Integer,Passenger>passengerDb=new HashMap<>();
    HashMap<City[],Flight>cityFlightDb=new HashMap<>();
    HashMap<String,Airport> airportDb=new HashMap<>();
    HashMap<Integer, List<Passenger>> flightPassengerDb=new HashMap<>();
    HashMap<Integer,Flight>flightDb=new HashMap<>();


    public String addAirport(Airport airport){

        //Simply add airport details to your database
        //Return a String message "SUCCESS"Name());
        String key=airport.getAirportName();

        airportDb.put(key,airport);

        return "SUCCESS";
    }
//    public String checkForLexo(String s1,String s2){
//        int i=0,j=0;
//        while(i < s1.length() && j < s2.length()){
//            if()
//        }
//    }

    public String getLargestAirportName(){

        //Largest airport is in terms of terminals. 3 terminal airport is larger than 2 terminal airport
        //Incase of a tie return the Lexicographically smallest airportName
        int maxNoOfTerminals=0;
        String largestAirport="";
        for(Airport airport:airportDb.values()){
            if(airport.getNoOfTerminals() > maxNoOfTerminals){
                maxNoOfTerminals= airport.getNoOfTerminals();
                largestAirport=airport.getAirportName();
            }else if(airport.getNoOfTerminals() == maxNoOfTerminals){
                if(airport.getAirportName().compareTo(largestAirport) < 0){
                    largestAirport=airport.getAirportName();
                }
                //maxNoOfTerminals=checkForLexo(airport.getAirportName(),largestAirport);
            }
        }

        return largestAirport;
    }


    public double getShortestDurationOfPossibleBetweenTwoCities(City fromCity, City toCity){

        //Find the duration by finding the shortest flight that connects these 2 cities directly
        //If there is no direct flight between 2 cities return -1.




        return 0;
    }


    public int getNumberOfPeopleOn(Date date, String airportName){

        //Calculate the total number of people who have flights on that day on a particular airport
        //This includes both the people who have come for a flight and who have landed on an airport after their flight
        int count=0;


        return 0;
    }


    public int calculateFlightFare(Integer flightId){

        //Calculation of flight prices is a function of number of people who have booked the flight already.
        //Price for any flight will be : 3000 + noOfPeopleWhoHaveAlreadyBooked*50
        //Suppose if 2 people have booked the flight already : the price of flight for the third person will be 3000 + 2*50 = 3100
        //This will not include the current person who is trying to book, he might also be just checking price

        return 0;

    }



    public String bookATicket(Integer flightId,Integer passengerId){

        //If the numberOfPassengers who have booked the flight is greater than : maxCapacity, in that case :
        //return a String "FAILURE"
        //Also if the passenger has already booked a flight then also return "FAILURE".
        //else if you are able to book a ticket then return "SUCCESS"
        if(flightPassengerDb.get(flightId).size() > flightDb.get(flightId).getMaxCapacity() || flightPassengerDb.containsKey(passengerDb.get(passengerId)))
            return "FAILURE";

        List<Passenger>passengerList=flightPassengerDb.get(flightId);
        passengerList.add(passengerDb.get(passengerId));

        int ticketsBooked=flightDb.get(flightId).getTicketsBooked();
        flightDb.get(flightId).setTicketsBooked(ticketsBooked+1);

        return "SUCCESS";
    }


    public String cancelATicket(Integer flightId,Integer passengerId){

        //If the passenger has not booked a ticket for that flight or the flightId is invalid or in any other failure case
        // then return a "FAILURE" message
        // Otherwise return a "SUCCESS" message
        // and also cancel the ticket that passenger had booked earlier on the given flightId

        return null;
    }



    public int countOfBookingsDoneByPassengerAllCombined(Integer passengerId){

        //Tell the count of flight bookings done by a passenger: This will tell the total count of flight bookings done by a passenger :
        return 0;
    }


    public String addFlight(Flight flight){

        //Return a "SUCCESS" message string after adding a flight.
        int key=flight.getFlightId();
        flightDb.put(key,flight);

        return "SUCCESS";
    }



    public String getAirportNameFromFlightId(Integer flightId){

        //We need to get the starting airportName from where the flight will be taking off (Hint think of City variable if that can be of some use)
        //return null incase the flightId is invalid or you are not able to find the airportName

        return null;
    }



    public int calculateRevenueOfAFlight(Integer flightId){

        //Calculate the total revenue that a flight could have
        //That is of all the passengers that have booked a flight till now and then calculate the revenue
        //Revenue will also decrease if some passenger cancels the flight


        return 0;
    }



    public String addPassenger(Passenger passenger){

        //Add a passenger to the database
        //And return a "SUCCESS" message if the passenger has been added successfully.
        int key = passenger.getPassengerId();

        passengerDb.put(key,passenger);

        return "SUCCESS";
    }


}