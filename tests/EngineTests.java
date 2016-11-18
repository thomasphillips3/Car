package tests;

import components.Engine;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Created by thomas on 11/17/16.
 */
public class EngineTests {
    private String NAME = "Ford Shelby GT500";
    private double DISPLACEMENT = 353.938;
    private double HORSEPOWER = 662;
    private int    CYLINDERS = 8;

    @Test
    public void getNameTest() throws Exception {
        Engine fordShelbyGt = new Engine(CYLINDERS);
        String name = fordShelbyGt.getName();
        assertEquals("getNameTest failed.", NAME, name);
    }

    @Test
    public void getCylindersTest() throws Exception {
        Engine fordShelbyGt = new Engine(8);
        int cylinders = fordShelbyGt.getCylinders();
        assertEquals("getCylindersTest failed.", CYLINDERS, cylinders);
    }

    @Test
    public void setCylindersTest() throws Exception {
        Engine eightCylinderEngine = new Engine();
        eightCylinderEngine.setCylinders(CYLINDERS);
        assertEquals("setCylindersTest failed.", CYLINDERS, eightCylinderEngine.getCylinders());
    }

    @Test
    public void getHorsepowerTest() throws Exception {
        Engine sixHundredSixtyTwoHorsepowerEngine = new Engine(CYLINDERS);
        double horsepower = sixHundredSixtyTwoHorsepowerEngine.getHorsepower();
        assertTrue("getHorsepowerTest failed.", (HORSEPOWER == horsepower));
    }

    @Test
    public void getDisplacementTest() throws Exception {
        Engine threeFiftyThreeDisplacement = new Engine(CYLINDERS);
        double displacement = threeFiftyThreeDisplacement.getDisplacement();
        assertTrue("getDisplacementTest failed.", (DISPLACEMENT == displacement));
    }

}