import org.junit.*;
import static org.junit.Assert.*;

public class UnitTest {

  @Test
  public void checkWinner_rockBeatsScissors_true() {
  RPS testRPS = new RPS();
  assertEquals(true, testRPS.checkWinner("Rock", "Scissors"));
  }

  @Test
  public void checkWinner_paperBeatsRock_true() {
  RPS testRPS = new RPS();
  assertEquals(true, testRPS.checkWinner("Paper", "Rock"));
  }

  @Test
  public void checkWinner_scissorsBeatsPaper_true() {
  RPS testRPS = new RPS();
  assertEquals(true, testRPS.checkWinner("Scissors", "Paper"));
  }


}
