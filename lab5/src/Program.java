public class Program {
  public static void main(String[] args) {

      var matrix = new int[][]{
              {5, 5, 5, 5},
              {5, 5, 5, 5},
              {9, 10, 11, 12},
              {13, 14, 15, 16}
      };

    MatrixSumThread thread1 = new MatrixSumThread(matrix, 0, 1); // Rows 0 and 1
    MatrixSumThread thread2 = new MatrixSumThread(matrix, 2, 3); // Rows 2 and 3

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (Exception e) {
      e.printStackTrace();
    }

    int totalSum = thread1.getSum() + thread2.getSum();
    System.out.println("Total sum of the matrix: " + totalSum);
  }
}
