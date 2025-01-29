package search.binary;

/**
 * Given an array in which every element appears twice except only one element which appears once. (All pairs of
 *  duplicate always appear together.)
 *
 *  { 3, 3, 1, 1, 8, 8, 10, 10, 6, 2, 2, 4, 4 }
 */

public class Problem5 {
    public static void run() {
        int arr[] = {3, 3, 1, 1, 8, 8, 6, 10, 10, 2, 2, 4, 4};
        System.out.println("Found odd element at index : "+ doBinarySearch(arr));
    }
    private static int doBinarySearch(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        if (arr.length == 2) {
            return -1;
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid == arr.length -1 || mid == 0) {
                // this means the odd element is either
                // on the first index or last index
                return mid;
            }
            if (arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]) {
                return mid;
            }
            if (mid%2 == 0) {
                if (arr[mid] == arr[mid+1]) {
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            } else {
                if (arr[mid] == arr[mid+1]) {
                    high = mid-1;
                } else {
                    low = mid+1;
                }
            }
        }
        return -1;
    }

}
