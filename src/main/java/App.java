import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.staticFileLocation;

public class App {

    public static void main(String[] args) {
        staticFileLocation("/public");


      get("/", (request,response)-> {
          Map<String, Object> model = new HashMap<>();
          return new ModelAndView(model, "home.hbs");
      }, new HandlebarsTemplateEngine());

        get("/endangered", (request,response)-> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "endangered.hbs");
        }, new HandlebarsTemplateEngine());

        get("/animal", (request,response)-> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "animal.hbs");
        }, new HandlebarsTemplateEngine());

        get("/ranger", (request,response)-> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "ranger.hbs");
        }, new HandlebarsTemplateEngine());

        get("/sightings", (request,response)-> {
            Map<String, Object> model = new HashMap<>();

            String name = request.queryParams("name");
            String age = request.queryParams("age");
            String ranger = request.queryParams("ranger");
            model.put("name", name);
            model.put("age", age);
            model.put("ranger", ranger);


            String names = request.queryParams("names");
            String healthy = request.queryParams("healthy");
            String ages = request.queryParams("age1");
            String rangers = request.queryParams("ranger1");
            model.put("names", names);
            model.put("healthy", healthy);
            model.put("ages", ages);
            model.put("rangers", rangers);
            return new ModelAndView(model, "sightings.hbs");
        }, new HandlebarsTemplateEngine());

    }
    }

