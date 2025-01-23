//given q square matrix n x n, convert to its transpose. without any extra space
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

package arrays.two_d;

public class Problem6 {
  public static void run(){
    int [][] arr = new int [3][3];
    arr[0] = new int [] {1, 2, 3};
    arr[1] = new int [] {4, 5, 6};
    arr[2] = new int [] {7, 8, 9};
    int rowLength = arr.length;
    int colLength = arr[0].length;
    //print before
    for(int i = 0; i < rowLength; i++ ){
      for(int j = 0; j < colLength; j++) {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println("***********");
    //logic
    for(int i = 0; i < rowLength; i++){
      for(int j = i+1; j < colLength; j++){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }
    //print after modifying
    for(int i = 0; i < rowLength; i++ ){
      for(int j = 0; j < colLength; j++) {
        System.out.print(arr[i][j] +" ");
      }
      System.out.println();
    }
  }
}