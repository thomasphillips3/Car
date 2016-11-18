package tests;

import components.Body;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by thomas on 11/17/16.
 */
public class BodyTests {
    private int DOORS = 4;

    @Test
    public void setDoorsTest() throws Exception {
        Body fourDoorCar = new Body();
        fourDoorCar.setDoors(DOORS);
        assertEquals("setDoorsTest failed.", DOORS, fourDoorCar.getDoors());
    }
}
