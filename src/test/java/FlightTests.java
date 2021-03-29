import Airports.Airport;
import Flight.Flight;
import People.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTests {

    Flight flight;

    @Before
    public void before(){
        flight = new Flight(Airport.ABZ, Airport.EDI);
    }


    @Test
    public void flightHasDept(){
        assertEquals("Aberdeen", flight.getDeptAirport());
    }


    @Test
    public void flightHasArrival(){
        assertEquals("Edinburgh", flight.getDestAirport());
    }


    @Test
    public void canAddPassenger(){
        Passenger passenger01;
        Passenger passenger02;
        Passenger passenger03;

        passenger01 = new Passenger("Jan", 2);
        passenger02 = new Passenger("Jessica", 3);
        passenger03 = new Passenger("Herdy", 1);

        flight.addPassenger(passenger01);
        flight.addPassenger(passenger02);
        flight.addPassenger(passenger03);

        assertEquals(3, flight.getPassengerCount());
    }


    @Test
    public void canCountBags(){
        Passenger passenger01;
        Passenger passenger02;
        Passenger passenger03;
        passenger01 = new Passenger("Jan", 2);
        passenger02 = new Passenger("Jessica", 3);
        passenger03 = new Passenger("Herdy", 1);

        assertEquals(6, flight.getFlightBagCount());
    }
}