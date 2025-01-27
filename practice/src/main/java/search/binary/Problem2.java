package search.binary;

/**
 * Given an array of N elements sorted in asc order find the frequency of given target.
 * ip -> {-5, -5, -3, 0, 0, 1, 1, 1, 5, 5, 5, 5, 5, 9}
 * op ->
 * target: 1 , frequency: 3
 * target: -3 , frequency: 1
 * target: 10 , frequency: 0
 * target: 5 , frequency: 6
 * <p>
 * hint: do two binary search
 */
public class Problem2 {
    public static void run() {
        int arr[] = {-5, -5, -3, 0, 0, 1, 1, 1, 5, 5, 5, 5, 5, 9};
        int target = -5;
        System.out.println(countFreq(arr, target));
    }

    // Function to return Lower Bound
    static int lowerBound(int[] arr, int target) {
        int res = arr.length;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start+end) / 2;
            if (arr[mid] >= target) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    // Function to return Upper Bound
    static int upperBound(int[] arr, int target) {
        int res = arr.length;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start+end) / 2;
            if (arr[mid] > target) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    static int countFreq(int[] arr, int target) {
        int lowerBound = lowerBound(arr, target);
        int upperBound = upperBound(arr, target);
        return upperBound - lowerBound;
    }

}
