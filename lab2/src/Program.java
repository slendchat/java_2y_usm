import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class FileNotFoundCustomException extends Exception {
  public FileNotFoundCustomException(String message) {
    super(message);
  }
}

  public class Program {

    public static void readFile(String fileName) throws FileNotFoundCustomException {
      File file = new File(fileName);

      try (Scanner fileScanner = new Scanner(file)) {
        System.out.println("File contents:");
        System.out.println(fileScanner.nextLine());
      }
      catch (FileNotFoundException e) {
        throw new FileNotFoundCustomException("File not found: " + fileName);
      }

    }

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the file name to read: ");
      String fileName = scanner.nextLine();

      try {
        readFile(fileName);
      } catch (FileNotFoundCustomException e) {
        System.out.println("Error: " + e.getMessage());
      }
    }
  }

