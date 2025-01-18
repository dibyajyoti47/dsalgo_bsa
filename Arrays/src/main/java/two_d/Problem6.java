//given q square matrix n x n, convert to its transpore. without any extra space
//ip:
/*
 1, 2, 3
 4, 5, 6
 7, 8, 9
*/


//op
/*
1, 4, 7
2, 5, 8
3, 6, 9
*/

package two_d;

public class Problem6 {
  public static void run(){
    int [][] arr = new int [3][3];
    arr[0] = new int [] {1, 2, 3};
    arr[1] = new int [] {4, 5, 6};
    arr[2] = new int [] {7, 8, 9};
    int rowLength = arr.length;
    int colLength = arr[0].length;
    for(int i = 0; i < rowLength; i++ ){
      for(int j = 0; j < colLength; j++) {

      }
      System.out.println();
    }
  }
}