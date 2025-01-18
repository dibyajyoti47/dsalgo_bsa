/*
Pair with target sum
ip :->  [1,2,3,4,5,6], target = 6
op :->  index of pair (1,4) i.e. 2+4 = 6
Observation: if the array is sorted then 1st element will be the smallest element and last element will be the largest element.
*/
package two_pointer_pattern;
public class Problem1 {
  public static void runn() {
    int[] arr = { 1, 2, 2, 4, 6, 9 };
    int target = 9;
    int leftPointer = 0;
    int rightPointer = arr.length - 1;
    int [] result = new int[2];
    result[0] = -1;
    result[1] = -1;
    while (leftPointer < rightPointer) {
      if(arr[leftPointer] + arr[rightPointer] == target){
        result[0] = leftPointer;
        result[1] = rightPointer;
        break;
      }
      if(arr[leftPointer] + arr[rightPointer] < target){
        leftPointer++;
      } else {
        rightPointer--;
      }        
    }
    System.out.println(result[0] + " " + result[1]);
  }
}