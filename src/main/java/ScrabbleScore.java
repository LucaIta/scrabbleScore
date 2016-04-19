import java.util.Map;
import java.util.HashMap;

public class ScrabbleScore {

  public static Integer calculateScore (String word) {
    Map<String, Integer> scoreMap = new HashMap<String, Integer>();
    scoreMap.put("aeioulnrst", 1);
    scoreMap.put("dg", 2);
    scoreMap.put("bcmp", 3);
    scoreMap.put("fhvwy", 4);
    scoreMap.put("k", 5);
    scoreMap.put("jx", 8);
    scoreMap.put("qz", 10);
    Integer score = 0;
    String[] letterArray = word.split("");
    for (String letter: letterArray) {
      for (String key: scoreMap.keySet()) {
        if (key.contains(letter)) {
          score += scoreMap.get(key);
        }
      }
    }
    return score;
  }
}
