/*
Given an array of size N and a number K. Return true if there exist two numbers in the array which sum up to K.
Such that A[i] + A[j] = K   and (i != j )

example - 3, -2, 1, 4, 3, 5, 6, 8, 5
  K = 10
  returns true ((6, 4)) 
*/

package arrays.one_d;
  
public class Problem2 {
  public static void run() {
    int[] arr = {3, -2, 1, 4, 3, 5, 6, 8, 5};
    int k = 10;
    boolean result = bruteForce(arr, k);
    System.out.println(result);
    result = optimize(arr, k);
    System.out.println(result);
  }

  static boolean bruteForce(int[] arr, int k) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (i != j && arr[i] + arr[j] == k) {
          return true;
       }
      }
    }
    return false;
  }

  static boolean optimize(int[] arr, int k) {
    for (int i=0; i<arr.length-1; i++){
      for(int j=i+1; j<arr.length; j++){
        if(arr[i]+arr[j] == k){
          return true;
        }
      }
    }
    return false;
  }
}