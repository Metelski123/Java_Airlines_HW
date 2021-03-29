import People.Crew.CrewType;
import People.Crew.FlightDeck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightDeckTests {

    FlightDeck pilot;

    @Before
    public void before() {
        pilot = new FlightDeck("Tom", CrewType.CAPTAIN,"0001M");
    }

    @Test
    public void hasName(){
        assertEquals("Tom", pilot.getName());
    }

    @Test
    public void pilotHasLicenseNumber(){
        assertEquals("0001M", pilot.getLicenseNumber());
    }

    @Test
    public void pilotCanTakeOff(){
        assertEquals("Fasten your seat belts, we're off!", pilot.takeOff());
    }

    @Test
    public void pilotCanLand(){
        assertEquals("Could be a bumpy landing, kiss your ass goodbye!", pilot.land());
    }

    @Test
    public void canMakeAnnouncement(){
        assertEquals("Sorry folks, we're out of cheese toasties", pilot.makeAnnouncement("Sorry folks, we're out of cheese toasties"));
    }

    @Test
    public void crewHasRank(){
        assertEquals("Captain", CrewType.CAPTAIN.getRank());
    }


}