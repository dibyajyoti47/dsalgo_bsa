package two_pointer_pattern;

/**
Input : [1,0,2,1,0]
exp op :-> [0,0,1,1,2]
Constants: only these three numbers will be there in this array.
all the zeros to the left and all the twos to the right..
constraints: no extra space, it has to be in place.
idea: put all the zeros to the left and all the twos to the right, then all the ones will fall into the middle.
*/

public class Problem2{
  public static void runn() {
    int[] arr = { 1, 0, 2, 1, 0 };
    int leftPointer = 0;
    int rightPointer = arr.length - 1;
    while(leftPointer < rightPointer) {
      if(arr[leftPointer] == 0){
        
      }
      if(arr[rightPointer] == 2){
        
      }
    }
  }
}