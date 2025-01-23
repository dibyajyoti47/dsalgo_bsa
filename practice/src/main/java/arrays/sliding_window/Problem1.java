package arrays.sliding_window;

/**
 * Maximum Sum of subarray of size K
 * i/p :-> {2,1,5,1,3,2} ; k= 3
 * op :-> idx2, idx3 and  idx4, i.e 5+1+3 = 9
 */
public class Problem1 {
    public static void run() {
        int[] arr = {2,1,5,1,3,2};
        int windowSize = 3;
        int maximumSum = 0;

        for (int i = 0; i < windowSize; i++) {
            maximumSum += arr[i];
        }

        int windowSum = maximumSum;
        for (int i = windowSize; i < arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i - windowSize];
            maximumSum = Math.max(maximumSum, windowSum);
        }

        System.out.println(maximumSum);
    }
    public static void runn() {
        int[] arr = {2,1,5,1,3,2};
        int windowSize = 3;

        int maximumSum = 0; int windowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum = windowSum + arr[windowEnd];
            if (windowEnd >= windowSize-1){
                maximumSum = Math.max(maximumSum, windowSum);
                windowSum = windowSum - arr[windowStart];
                windowStart++;
            }
        }

        System.out.println(maximumSum);
    }
}
