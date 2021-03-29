package Flight;

import Airports.Airport;
import People.Crew.CabinCrew;
import People.Crew.FlightDeck;
import People.Passenger;

import java.util.ArrayList;

public class Flight {


    Airport dept;
    Airport dest;

    private ArrayList<FlightDeck> flightDeckMembers;
    private ArrayList<CabinCrew> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private int totalBags;

    public Flight(Airport dept, Airport dest){
        this.dept = dept;
        this.dest = dest;

        this.flightDeckMembers = new ArrayList<FlightDeck>();
        this.cabinCrewMembers = new ArrayList<CabinCrew>();
        this.passengers = new ArrayList<Passenger>();

    }



    public String getDeptAirport() {
        return this.dept.getAirportName();
    }

    public String getDestAirport() {
        return this.dest.getAirportName();
    }


    public void addFlightDeckMembers(FlightDeck flightDeck) {
        this.flightDeckMembers.add(flightDeck);
    }

    public void addCabinCrewMembers(CabinCrew cabinCrew) {
        this.cabinCrewMembers.add(cabinCrew);
        System.out.println(cabinCrewMembers.get(0).getName());
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }


    public int getPassengerCount() {
        return this.passengers.size();
    }


    public int getFlightBagCount(){
        for(Passenger passenger:passengers  ) {
            totalBags += passenger.getPassengerBagCount();
        }
        return totalBags;
    }

}