package arrays.two_d;


// given a matrix of size n x m. Print the sum of every row.
// row - 3,  col - 4
//
// 4 3 1 7
// 6 2 3 4
// 5 3 2 7

//op ->  r1 : 15, r2: 15, r3: 17

public class Problem1 {
  public static void run() {
    int [][] arr = new int [3][4];
    arr[0] = new int [] {4, 3, 1, 7};
    arr[1] = new int [] {6, 2, 3, 4};
    arr[2] = new int [] {5, 3, 2, 7};

    int rowLength = arr.length;
    int colLength = arr[0].length;

    for(int i = 0; i < rowLength; i++ ) {
      int sum = 0;
      for(int j = 0; j < colLength; j++) {
        sum += arr[i][j];
      }
      System.out.println("r" + i + " : " + sum);
    }
  }
}

// tc -> O(N x M) ~= O(N^2)
// sc -> O(1)