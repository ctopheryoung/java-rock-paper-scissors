import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RPS {
  public static void main(String[] args) {

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());
  }
}
