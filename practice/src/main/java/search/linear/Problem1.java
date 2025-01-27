package search.linear;

public class Problem1 {
    public static void run () {
        int arr[] = new int[] { 3, 6, 1, 0, 9, 15, 8 };
        int target = 19;
        System.out.println(findTarget(arr, target));
    }
    public static int findTarget(int [] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
