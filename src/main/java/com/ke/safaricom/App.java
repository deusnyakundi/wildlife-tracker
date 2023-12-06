package com.ke.safaricom;

import com.ke.safaricom.interfaces.Wildlife;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("public");


        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
        get("/sightings/add", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("healthy", Constants.HEALTHY);
            model.put("ill", Constants.ILL);
            model.put("okay", Constants.OKAY);
            model.put("newborn", Constants.NEWBORN);
            model.put("young", Constants.YOUNG);
            model.put("adult", Constants.ADULT);
            return new ModelAndView(model, "animal-add-form.hbs");
        }, new HandlebarsTemplateEngine());
        get("/sightings", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Sighting> sightingList = Sighting.all();
            for (Sighting sightingItem : sightingList) {
                Date date = sightingItem.getSightingTime();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, MMMM d 'at' hh:mm a");
                simpleDateFormat.format(date);
            }
            model.put("sightings", sightingList);
            return new ModelAndView(model, "sightings-all.hbs");
        }, new HandlebarsTemplateEngine());
