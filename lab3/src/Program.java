import java.util.*;

public class Program {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input the sentence
    System.out.println("Enter a sentence:");
    String sentence = scanner.nextLine();

    // Input the index for word extraction
    System.out.print("Enter the index of the word to extract: ");
    int index = scanner.nextInt();
    scanner.nextLine();  // Clear the buffer

    // Extract the i-th word
    String wordAtIndex = TextUtilities.getWord(sentence, index);
    System.out.println("The word at index " + index + " is: " + wordAtIndex);

    // Count the number of words
    int wordCount = TextUtilities.countWords(sentence);
    System.out.println("The total number of words is: " + wordCount);

    // Find words that start with 'k' or 'K'
    List<String> wordsStartingWithK = TextUtilities.findWordsStartingWithK(sentence);
    System.out.println("Words starting with 'k' or 'K': " + wordsStartingWithK);

    // Sort the words in the sentence
    List<String> sortedWords = TextUtilities.sortWords(sentence);
    System.out.println("Sorted words: " + sortedWords);

    scanner.close(); // Close the scanner to avoid resource leaks
  }
}
