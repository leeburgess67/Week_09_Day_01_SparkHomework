import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class NameController {
    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");


        get("/one", (req, res) -> {
            Name name = new Name();
            String foundName = name.getRandomName();

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", foundName);
            return new ModelAndView(model, "one.vtl");
        }, velocityTemplateEngine);

        get("/two", (req, res) -> {
            Name name = new Name();
           ArrayList<String> twoNames = new ArrayList<>();
           twoNames = name.getRandom2Names(); //returns arraylist

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", twoNames);
            return new ModelAndView(model, "two.vtl");
        }, velocityTemplateEngine);

        get("/three", (req, res) -> {
            Name name = new Name();
            ArrayList<String> threeNames = new ArrayList<>();
            threeNames = name.getRandom3Names(); //returns arraylist

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", threeNames);
            return new ModelAndView(model, "three.vtl");
        }, velocityTemplateEngine);

        get("/four", (req, res) -> {
            Name name = new Name();
            ArrayList<String> fourNames = new ArrayList<>();
            fourNames = name.getRandom4Names(); //returns arraylist

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", fourNames);
            return new ModelAndView(model, "four.vtl");
        }, velocityTemplateEngine);
    }
}
