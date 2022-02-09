package edu.escuelaing.arep;

import static spark.Spark.*;
import spark.*;
import com.google.gson.*;

import edu.escuelaing.arep.temperatura.*;

public class SparkWebApp {
    public static void main(String[] args) {
        port(getPort());
        staticFiles.location("/web");

        path("/temperatura",()->{
            get("/Celsius","application/json",(req,res)->{
               return getCelsius(Double.valueOf(req.queryParams("value")));
            });
            get("/Fahrenheit","application/json",(req,res)->{
                return getFahrenheit(Double.valueOf(req.queryParams("values")));
            });
        });
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; // returns default port if heroku-port isn't set (i.e. on localhost)
    }

    private static String getCelsius(double value){
        return new Gson().toJson(new Celsius(value));
    }

    private static String getFahrenheit(double value){
        return new Gson().toJson(new Fahrenheit(value));
    }
}
