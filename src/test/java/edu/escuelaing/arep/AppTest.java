package edu.escuelaing.arep;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import edu.escuelaing.arep.temperatura.*;

import static junit.framework.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest{

    Celsius celsius;
    Fahrenheit fahrenheit;

    @Test
    public void CelsiusAFarenheit(){
        celsius = new Celsius(10);
        assertEquals(celsius.getFahrenheit(10),50);

    }

}
