//print all the elements above all the diagonal elements.

package arrays.two_d;

public class Problem5 {
  public static void run() {
    int [][] matrix = new int[4][4];
    matrix[0] = new int[]{1,2,3,4};
    matrix[1] = new int[]{5,6,7,8};
    matrix[2] = new int[]{9,10,11,12};
    matrix[3] = new int[]{13,14,15,16};

    for (int row = 0; row < matrix.length; row++) {
      for (int col = row+1; col < matrix.length; col++) {
        System.out.print(matrix[row][col] + " ");
      }
      System.out.println();
    }
  }
}