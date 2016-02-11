import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.Random;

public class RPS {
  public static void main(String[] args) {
    staticFileLocation("/public");
    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");

      String player = request.queryParams("player");
      String computer = computerPlay();
      String results = checkWinner(player, computer);
      model.put("player", player);
      model.put("computer", computer);
      model.put("results", results);
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());
  }

  public static String computerPlay() {
    Random randy = new Random();
    String[] plays = {"Rock", "Paper", "Scissors"};
    int rando = randy.nextInt(3);
    String result = "";

    for (int i = 0; i <= plays.length; i++)
      if (i == rando) {
        result = plays[i];
      }
    return result;
  }

  public static String checkWinner(String playerOne, String playerTwo) {
    if (playerOne.equals("Rock") && playerTwo.equals("Scissors"))
    {
      return "You won!";
    }
    else if (playerOne.equals("Paper") && playerTwo.equals("Rock"))
    {
      return "You won!";
    }
    else if (playerOne.equals("Scissors") && playerTwo.equals("Paper"))
    {
      return "You won!";
    }
    else if (playerOne.equals(playerTwo))
    {
      return "You tied!";
    }
    else
    {
      return "You lost!";
    }
  }
}
