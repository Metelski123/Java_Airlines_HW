import People.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTests {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Winston", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Winston", passenger.getName());
    }

    @Test
    public void getPassengerBagCount(){
        assertEquals(2, passenger.getPassengerBagCount());
    }
}