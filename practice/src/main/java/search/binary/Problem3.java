package search.binary;

/**
 * Given an array of N distinct numbers find ANY local minima in the array.
 * local minima means - an element which is smaller than all available neighbour (adjacent element)
 * ip -> { 3, 6, 1, 0, 9, 15, 8 }
 * op -> 0
 */
public class Problem3 {
    public static void run () {
        int arr[] = new int[] { 13, 6, 1, 19, 9, 15, 18 };
//        int arr[] = {1, 3, 2};  op- 1
        System.out.println(getLocalMinima(arr));
    }
    public static int getLocalMinima(int [] arr) {

        if (arr[0]< arr[1]) return arr[0];
        if (arr[arr.length-1] < arr[arr.length-2]) return arr[arr.length-1];
        int start = 1;
        int end = arr.length - 2;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                return arr[mid];
            } else if (arr[mid - 1] < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
