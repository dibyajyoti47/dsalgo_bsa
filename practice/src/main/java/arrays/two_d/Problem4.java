// find the sum of the all diagonal elements of a matrix.
// row - 4,  col - 4
//
// 4 3 1 9
// 6 2 3 7
// 5 3 2 3
// 7 6 2 5

// corner case if the matrix is odd number like 3 x 3 or 5 x 5

package arrays.two_d;

public class Problem4 {
  public static void run() {

    int [][] arr = new int [4][4];
    arr[0] = new int [] {4, 3, 1, 9};
    arr[1] = new int [] {6, 2, 3, 7};
    arr[2] = new int [] {5, 3, 2, 3};
    arr[3] = new int [] {7, 6, 2, 5};

    int rowLength = arr.length;
    int coLength = arr[0].length;
    int sum = 0;
    //brute force
    for(int i = 0; i < rowLength; i++ ){
      for(int j = 0; j < coLength; j++) {
        if(i == j) {
          sum += arr[i][j];
        }
        if( arr[i].length - 1 - i == j){
          sum += arr[i][j];
        }
      }
    }    
    System.out.println("sum : " + sum );

    //optimized
    int sum2 = 0;
    for(int i = 0; i < rowLength; i++ ) {
      sum2 += arr[i][i];
      sum2 += arr[i][rowLength - i - 1];
    }
    System.out.println("sum : " + sum2 );
  }
}