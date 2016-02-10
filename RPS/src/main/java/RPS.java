import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.Random;

public class RPS {
  public static void main(String[] args) {

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/home.vtl");
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

  public static Boolean checkTie(String playerOne, String playerTwo) {
    if (playerOne.equals("Rock") && playerTwo.equals("Rock"))
    {
      return true;
    }
    else if (playerOne.equals("Paper") && playerTwo.equals("Paper"))
    {
      return true;
    }
    else if (playerOne.equals("Scissors") && playerTwo.equals("Scissors"))
    {
      return true;
    }
    else
    {
      return false;
    }
  }

}
