import org.junit.*;
import static org.junit.Assert.*;


public class ScrabbleScoreTest {

  @Test
  public void calculateScore_returnsScoreForSingleLetter_aeioulnrst(){
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_dg(){
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("d"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_bcmp(){
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 3;
    assertEquals(expected, testScrabble.calculateScore("p"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_fhvwy(){
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 4;
    assertEquals(expected, testScrabble.calculateScore("v"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_k(){
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 5;
    assertEquals(expected, testScrabble.calculateScore("k"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_jx(){
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 8;
    assertEquals(expected, testScrabble.calculateScore("j"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_qz(){
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 10;
    assertEquals(expected, testScrabble.calculateScore("q"));
    assertEquals(expected, testScrabble.calculateScore("z"));
  }
  @Test
  public void calculateScore_returnsScoreForMultipleLetters_zebra(){
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 16;
    assertEquals(expected, testScrabble.calculateScore("zebra"));
  }
}
