public class MatrixSumThread extends Thread {
  private int[][] matrix;
  private int startRow;
  private int endRow;
  private int sum;

  // Constructor to initialize matrix and rows to be processed
  public MatrixSumThread(int[][] matrix, int startRow, int endRow) {
    this.matrix = matrix;
    this.startRow = startRow;
    this.endRow = endRow;
  }

  // Method that performs summation of the assigned matrix part
  @Override
  public void run() {
    sum = 0;
    for (int i = startRow; i <= endRow; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        sum += matrix[i][j];
      }
    }
    System.out.println(Thread.currentThread().getName() + " sum: " + sum);
  }

  public int getSum() {
    return sum;
  }
}
