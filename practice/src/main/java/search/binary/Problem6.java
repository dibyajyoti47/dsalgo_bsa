package search.binary;

/**
 * Given a number N, find the floor that is (square root of N)
 *  {2,3,5, 6, 7,8,9,10,13,14,16,17}  target: 101
 */
public class Problem6 {
    public static void run() {
        int[] arr = {2,3,5,6,7,9,10,11,13,14};
        System.out.println(" Found at : "+ doBinarySearch(arr, 196));
    }
    public static int doBinarySearch(int[] arr, int target) {
        int n = arr.length;
        int ans = -1;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid]*arr[mid] == target) return mid;
            if (arr[mid] * arr[mid] < target) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
