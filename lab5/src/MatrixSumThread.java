public class MatrixSumThread extends Thread
{
  private int[][] matrix;
  private int startRow;
  private int endRow;
  private int sum;

  public MatrixSumThread(int[][] matrix, int startRow, int endRow) {
    this.matrix = matrix;
    this.startRow = startRow;
    this.endRow = endRow;
  }

  @Override
  public void run() {
    sum = 0;
    for (int i = startRow; i <= endRow; i++) {
      for (int num : matrix[i]) {
        sum += num;
      }
    }
    System.out.println(Thread.currentThread().getName() + " sum: " + sum);
  }
  public int getSum() {
    return sum;
  }
}
