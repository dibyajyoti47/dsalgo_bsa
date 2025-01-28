package search.binary;

/**
 * Do a search in a sorted, but rotated array(distinct elements)
 *
 * ip -> { 4, 5, 8, 10, 1, 2, 3 } it means there are two sorted arrays
 */

public class Problem4 {
    public static void run () {
        int arr[] = { 11, 12, 18, 1, 2, 3, 6, 9 };
//        int arr[] = {8,9,2,3,4};
        int element = doBinarySearch(arr, 9);
        System.out.println("found element at : " + element);
    }

    private static int doBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if(arr[start] <= arr[mid]) {
                if(target < arr[mid] && target >= arr[start] ) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
