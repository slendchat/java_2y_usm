import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextUtilities {

  // Method to extract the i-th word from a string
  public static String getWord(String sentence, int index) {
    String[] words = sentence.split("[\\s\\p{Punct}]+");
    if (index < 1 || index > words.length) {
      return "Index out of bounds.";
    }
    return words[index - 1]; // Adjust for 1-based index
  }

  // Method to count the number of words in the string
  public static int countWords(String sentence) {
    String[] words = sentence.split("[\\s\\p{Punct}]+");
    return words.length;
  }

  // Method to find all words that start with 'k' or 'K' using regex
  public static List<String> findWordsStartingWithK(String sentence) {
    List<String> wordsStartingWithK = new ArrayList<>();
    Pattern pattern = Pattern.compile("\\b[kK]\\w+"); // Word boundary, starts with 'k' or 'K'
    Matcher matcher = pattern.matcher(sentence);
    while (matcher.find()) {
      wordsStartingWithK.add(matcher.group());
    }
    return wordsStartingWithK;
  }

  // Method to create a collection of words, sort it, and return it as a List
  public static List<String> sortWords(String sentence) {
    String[] words = sentence.split("[\\s\\p{Punct}]+");
    List<String> wordList = Arrays.asList(words);
    Collections.sort(wordList);
    return wordList;
  }
}
