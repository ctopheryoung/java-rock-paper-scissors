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

  @Test
  public void checkWinner_rockLosesToPaper_false() {
    RPS testRPS = new RPS();
    assertEquals(false, testRPS.checkWinner("Rock", "Paper"));
  }

  @Test
  public void checkTie_rockTiesRock_true() {
    RPS testRPS = new RPS();
    assertEquals(true, testRPS.checkTie("Rock", "Rock"));
  }

  @Test
  public void checkTie_rockDontTiePaper_false() {
    RPS testRPS = new RPS();
    assertEquals(false, testRPS.checkTie("Rock", "Paper"));
  }

  @Test
  public void computerPlay_shouldBeAString_true() {
    RPS testRPS = new RPS();
    String computerChoice =  testRPS.computerPlay();
    assertEquals(true, computerChoice instanceof String);
  }

}
