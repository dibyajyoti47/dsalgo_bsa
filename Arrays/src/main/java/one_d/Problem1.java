package one_d;
/*
Given an array of size n count the number of elements which have at least one element greater than itself.
i/p ->  -3, 2, 6, 8, 4, 8, 5
o/p ->  total 5 elemtns  (-3, 2, 6, 4, 5)
*/

public class Problem1 {
  public static void run() {
    int[] arr = {-3, 2, 6, 8, 4, 8, 5};

    //brute force start
    int count = 0;
    int largestElement = arr[0];    
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largestElement) {
       largestElement = arr[i];
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < largestElement) {
        count++;
      }
    }    
    System.out.println(count);
    //brute force end
    
    //optimized start
    int count2 = 0;
    int largestElement2 = arr[0];
    for (int i = 0; i < arr.length; i++) {        
      if (arr[i] > largestElement2) {
        count2 = 1;
        largestElement2 = arr[i];
      } else if (arr[i] == largestElement2) {
        count2 = count2 + 1;
      }
    }
    System.out.println("count : " + ( arr.length - count2));
    //optimized end
  }
}