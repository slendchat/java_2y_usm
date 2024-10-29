import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextUtilities {
  public static String getWord(String sentence, int index) {
    String[] words = sentence.split("[\\s\\p{Punct}]+");
    if (index < 1 || index > words.length) {
      return "Index out of bounds.";
    }
    return words[index - 1];
  }

  public static int countWords(String sentence) {
    String[] words = sentence.split("[\\s\\p{Punct}]+");
    return words.length;
  }

  public static List<String> findWordsStartingWithK(String sentence) {
    List<String> wordsStartingWithK = new ArrayList<>();
    Pattern pattern = Pattern.compile("\\b[kK]\\w+");
    Matcher matcher = pattern.matcher(sentence);
    while (matcher.find()) {
      wordsStartingWithK.add(matcher.group());
    }
    return wordsStartingWithK;
  }

  public static List<String> sortWords(String sentence) {
    String[] words = sentence.split("[\\s\\p{Punct}]+");
    List<String> wordList = Arrays.asList(words);
    Collections.sort(wordList);
    return wordList;
  }
}
