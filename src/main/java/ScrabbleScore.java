import java.io.Console;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class ScrabbleScore {

  public static void main(String[] args) {
  }

  public static Integer calculateScore (String word) {
    Console myConsole = System.console();
    Map<String, Integer> scoreMap = new HashMap<String, Integer>();
    scoreMap.put("aeioulnrst", 1);
    for (String key: scoreMap.keySet()) {
      System.out.println(key);
      if (key.contains(word)) {
        return scoreMap.get(key);
      }
    }
    return 0;
  }
}
