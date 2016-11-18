package tests;

import components.Engine;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by thomas on 11/17/16.
 */
public class EngineTest {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void getCylinders() throws Exception {

    }

    @org.junit.Test
    public void setCylindersTest() throws Exception {
        Engine hemiV8 = new Engine();
        hemiV8.setCylinders(8);
        Assert.assertTrue("Failed to set cylinders", hemiV8.getCylinders() == 8);
    }

    @org.junit.Test
    public void getHorsepower() throws Exception {

    }

    @org.junit.Test
    public void setHorsepower() throws Exception {

    }

}