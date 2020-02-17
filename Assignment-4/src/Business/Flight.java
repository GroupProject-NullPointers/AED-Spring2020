/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author AEDSpring2019
 */
public class Flight implements Comparable<Flight> {

    private String airlinerName;
    private String flightNumber;
    private String source;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private double flightPrice;
    private int totalSeats;
    private int availableSeats;
    //private ArrayList<Seats> seatList;
    //private Seats seat;

    public Flight(String airlinerName,String flightNumber,String source,String destination,String departureTime,String arrivalTime,double flightPrice,int totalSeats ){
        //seatList = new ArrayList<>();
        this.airlinerName = airlinerName;
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime =arrivalTime;
        this.flightPrice = flightPrice;
        this.totalSeats = totalSeats;
        //seatList=createSeats(totalSeats);
        this.availableSeats = totalSeats;
        
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getFlightPrice() {
        return flightPrice;
    }

    public void setFlightPrice(double flightPrice) {
        this.flightPrice = flightPrice;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    
    
    
    
        @Override
        public int compareTo(Flight o) 
        {
        return this.airlinerName.compareTo(o.getAirlinerName());
        }
        
        
    
}
