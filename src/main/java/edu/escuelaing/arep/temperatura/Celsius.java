package edu.escuelaing.arep.temperatura;

public class Celsius {
    private double celsius;
    private double fahrenheit;

    public Celsius(double celsius) {
        this.celsius = celsius;
    }

    public String getCelsius() {
        return "{ celsius:"+celsius+"}";
    }

    public String getFahrenheit(double celsius) {
        fahrenheit = (celsius * 9 / 5) + 32;
        return "{ fahrenheit:"+fahrenheit+"}";
    }
}
