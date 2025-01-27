package search.binary;
/*
Given a sorted array that is ascending find the floor of a given target.
floor(t) -> the greatest number less than or equal to target
ip-> {-5,2,3,6,9,10,11,15,18}
     floor(7) -> 6 ; floor(11) -> 11 ; floor(-6) -> -1 (because it does not exist in the array)
 */
public class Problem1 {

    public static void run() {
        int [] arr = {-5,2,3,6,9,10,11,15,18};
        System.out.println(searchFloorWithBinarySearch(arr, 7));
    }

    public static int searchFloorWithBinarySearch(int[] arr, int target) {
        int strat = 0;
        int end = arr.length-1;
        int ans = Integer.MIN_VALUE;
        while (strat <= end) {
            int mid = (strat + end)/2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                strat = mid+1;
                ans = arr[mid];
            } else {
                end = mid-1;
            }
        }
        return ans;
    }

}
