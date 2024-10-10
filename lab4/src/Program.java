public class Program {
  public static void main(String[] args) {
    // Define a 4x4 matrix
    int[][] matrix = {
            {5, 5, 5, 5},
            {5, 5, 5, 5},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
    };

    // Create two threads: one for the first half and one for the second half
    MatrixSumThread thread1 = new MatrixSumThread(matrix, 0, 1); // Rows 0 and 1
    MatrixSumThread thread2 = new MatrixSumThread(matrix, 2, 3); // Rows 2 and 3

    // Start both threads
    thread1.start();
    thread2.start();

    // Wait for both threads to complete
    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // Calculate total sum from both threads
    int totalSum = thread1.getSum() + thread2.getSum();
    System.out.println("Total sum of the matrix: " + totalSum);
  }
}
