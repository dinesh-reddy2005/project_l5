public class MatrixMultiplication {
  public static void main(String[] args) {
      // Define two matrices
      int[][] matrixA = {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}
      };

      int[][] matrixB = {
          {9, 8, 7},
          {6, 5, 4},
          {3, 2, 1}
      };

      // Multiply the matrices
      int[][] result = multiplyMatrices(matrixA, matrixB);

      // Print the result
      for (int i = 0; i < result.length; i++) {
          for (int j = 0; j < result[0].length; j++) {
              System.out.print(result[i][j] + " ");
          }
          System.out.println();
      }
  }

  public static int[][] multiplyMatrices(int[][] a, int[][] b) {
      int rowsA = a.length;
      int colsA = a[0].length;
      int colsB = b[0].length;

      int[][] result = new int[rowsA][colsB];

      for (int i = 0; i < rowsA; i++) {
          for (int j = 0; j < colsB; j++) {
              result[i][j] = 0;
              for (int k = 0; k < colsA; k++) {
                  result[i][j] += a[i][k] * b[k][j];
              }
          }
      }

      return result;
  }
}
