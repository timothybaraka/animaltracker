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

    }
    }

