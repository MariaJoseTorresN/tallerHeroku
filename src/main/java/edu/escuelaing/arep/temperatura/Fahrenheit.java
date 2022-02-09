package edu.escuelaing.arep.temperatura;

public class Fahrenheit {
    private double celsius;
    private double fahrenheit;

    public Fahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public String getCelsius(double fahrenheit) {
        celsius = (fahrenheit - 32) * 5 / 9;
        return "{ celsius:"+celsius+"}";
    }

    public String getFahrenheit() {
        return "{ Farenheit:"+fahrenheit+"}";
    }
}
