import org.junit.Before;
import org.junit.Test;
import Plane.Plane;
import Plane.PlaneModelType;

import static org.junit.Assert.assertEquals;

public class PlaneTests {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneModelType.B737);
    }


    @Test
    public void planeHasModelType(){
        assertEquals("737", PlaneModelType.B737.getModelType());
    }

    @Test
    public void planeHasSeats(){
        assertEquals(100, PlaneModelType.B737.getNumberOfSeats());
    }


}