package search.binary;

/**
 * Given an array of positive numbers, find the max length K, such that there exists no subarray of length K with a
 * sum >= B (given)
 * e.g = { 3,2,5,4,6,3,7,2 } B=20;
 * op:3, because all the subarrays having size 3 have sum which is less than 20 or not >= 20.
 */
public class Problem7 {

    public static void run() {
        int[] arr = { 3,2,5,4,6,3,7,2 };
        System.out.println(maximumSumArrLength(arr, 26));
    }

    public static int maximumSumArrLength(int[] arr, int upperBound) {
        int k = arr.length - 1;
        int low = 0, high = k-1, ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (checkSumOfSubArr(arr, mid+1, upperBound)) {
                ans = mid+1;
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return ans;
    }

    private static boolean checkSumOfSubArr(int[] arr, int windowSize, int upperBound) {
        int windowStart = 0;
        int windowSum = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum = windowSum + arr[windowEnd];
            if (windowSum >= upperBound) {
                return false;
            }
            if (windowEnd >= windowSize-1) {
                windowSum = windowSum - arr[windowStart];
                windowStart++;
            }
        }
        return true;
    }
}
