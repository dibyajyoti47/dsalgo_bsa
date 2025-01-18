
// given a matrix of size n x n. Print the diagoanl elements.
// row - 3,  col - 3
//
// 4 3 1 
// 6 2 3 
// 5 3 2 

//op ->  4, 2, 2
package two_d;

public class Problem3 {
  public static void run() {
    int [][] arr = new int [3][3];
    arr[0] = new int [] {4, 3, 1};
    arr[1] = new int [] {6, 2, 3};
    arr[2] = new int [] {5, 3, 2};

    int rowLength = arr.length;
    int colLength = arr[0].length;
// brute force tc: O(N^2) 
    for(int i = 0; i < rowLength; i++ ) {
      for(int j = 0; j < colLength; j++) {
        if(i == j) {
          System.out.println(arr[i][j]);
        }
      }
    }
// optimized  tc: O(N) sc: O(1)
    for(int i = 0; i < rowLength; i++ ) {
      System.out.println(arr[i][i]);
    }
  }
}

// tc -> O() ~= O()
// sc -> O()