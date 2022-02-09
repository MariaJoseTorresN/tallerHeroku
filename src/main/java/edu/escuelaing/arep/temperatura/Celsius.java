package edu.escuelaing.arep.temperatura;

public class Celsius {
    private double celsius;
    private double fahrenheit;

    public Celsius(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit(double celsius) {
        fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }
}
