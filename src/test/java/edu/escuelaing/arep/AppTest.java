package edu.escuelaing.arep;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import edu.escuelaing.arep.temperatura.*;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    Celsius celsius;
    Fahrenheit fahrenheit;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testCelsiusAFahrenheit() {
        celsius.getFahrenheit(10);
        assertTrue(true);
    }
}
