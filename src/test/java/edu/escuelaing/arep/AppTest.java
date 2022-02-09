package edu.escuelaing.arep;


import edu.escuelaing.arep.temperatura.*;
import org.junit.Assert;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest{

    Celsius celsius;
    Fahrenheit fahrenheit;

    @Test
    public void CelsiusAFarenheit(){
        celsius = new Celsius(10);
        Assert.assertEquals(celsius.getFahrenheit(10),50);

    }

}
