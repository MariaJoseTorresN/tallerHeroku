package edu.escuelaing.arep.temperatura;

public class Fahrenheit {
    private double celsius;
    private double fahrenheit;

    public Fahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius(double fahrenheit) {
        celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }
}
