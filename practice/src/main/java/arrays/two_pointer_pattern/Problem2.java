package arrays.two_pointer_pattern;

/*
https://leetcode.com/problems/sort-colors/
Input : {2,0,2,1,1,0}
exp op :-> [0,0,1,1,2,2]
Constants: only these three numbers will be there in this array.
all the zeros to the left and all the twos to the right..
constraints: no extra space, it has to be in place.
idea: put all the zeros to the left and all the twos to the right, then all the ones will fall into the middle.
*/

public class Problem2{
  public static void run() {
    int[] arr = {2,0,2,1,1,0};
    int leftPointer = 0;
    int rightPointer = arr.length - 1;
    int currentElement = 0;

    while(currentElement <= rightPointer) {
      if(arr[currentElement] == 0) {
        swap(arr, currentElement, leftPointer);
        leftPointer++; currentElement++;
      } else if(arr[currentElement] == 1) {
        currentElement++;
      } else {
        swap(arr, currentElement, rightPointer);
        rightPointer--;
      }
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+ ",");
    }
  }
  public static void swap(int [] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}