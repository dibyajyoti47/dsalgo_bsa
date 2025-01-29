package search.binary;

/**
 * https://www.geeksforgeeks.org/assign-stalls-to-k-cows-to-maximize-the-minimum-distance-between-them/
 * https://www.youtube.com/watch?v=R_Mfw4ew-Vo
 * Aggressive Cows
 *
 *  A sorted array of positive integers containing the position of rooms where we can keep the cows, that is a[n]
 *  count of cows is K. K <= N
 *  Return the max value of minimum distance between any two cows
 */
public class Problem8 {
    public static void run() {
        int stalls[]  = {0,3,4,7,9,10};  //total cows: 4;  op: 3
        int stalls2[] = {1, 2, 4, 8, 9}; //total cows: 3; op: 3
        int stalls3[] = {6, 7,  9, 11, 13, 15}; // total cows: 4 op: 2
        System.out.println("maximum of minimum distance is : "+ findTheMaxMinDistance(stalls2, 3));
    }
    public static int findTheMaxMinDistance(int[] stalls, int totalCows) {
        int ans = -1;
        int n = stalls.length;
        int low = 0;
        int high = stalls[n - 1] - stalls[0];
        while (low <= high) {
            int mid = (low + high) / 2;
            if(canBePlaced(stalls, totalCows, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static boolean canBePlaced(int[] stalls, int totalCows, int distance) {
        int cowsPlaced = 1;
        int lastPosition = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= distance) {
                cowsPlaced++;
                lastPosition = stalls[i];
            }
            if (cowsPlaced == totalCows) {
                return true;
            }
        }
        return false;
    }
}
