package edu.escuelaing.arep;

import static spark.Spark.*;
import spark.*;

import edu.escuelaing.arep.temperatura.*;

public class SparkWebApp {
    public static void main(String[] args) {
        port(getPort());
        staticFiles.location("/web");
        init();
        get("/", (req, res) -> {
            res.redirect("/index.html");
            return null;
        });
            get("/Celsius","application/json",(req,res)->{
               return new Celsius(Double.valueOf(req.queryParams("value"))).getCelsius();
            });
            get("/Fahrenheit","application/json",(req,res)->{
                return new Fahrenheit(Double.valueOf(req.queryParams("values"))).getFahrenheit();
            });

    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; // returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
