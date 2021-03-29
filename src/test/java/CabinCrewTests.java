import org.junit.Before;
import org.junit.Test;
import People.Crew.CrewType;

import static org.junit.Assert.assertEquals;

public class CabinCrewTests {

    People.Crew.CabinCrew cabinCrew;


    @Before
    public void before(){
        cabinCrew = new People.Crew.CabinCrew("Timmy", CrewType.FLIGHTATTENDANT );
    }

    @Test
    public void cabinCrewHasRank(){
        assertEquals("Flight Attendant", CrewType.FLIGHTATTENDANT.getRank());
    }

    @Test
    public void cabinCrewHasName(){
        assertEquals("Timmy", cabinCrew.getName());
    }

    @Test
    public void crewCanMakeAnnouncement(){
        assertEquals("Sorry folks, we're out of cheese toasties", cabinCrew.makeAnnouncement("Sorry folks, we're out of cheese toasties"));
    }
}