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

  public static Boolean checkWinner(String playerOne, String playerTwo) {
    if (playerOne.equals("Rock") && playerTwo.equals("Scissors"))
    {
      return true;
    }
    else if (playerOne.equals("Paper") && playerTwo.equals("Rock"))
    {
      return true;
    }
    else if (playerOne.equals("Scissors") && playerTwo.equals("Paper"))
    {
      return true;
    }
    else
    {
      return false;
    }
  }

}
