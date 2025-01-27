package search.binary;

/**
 * Given an array of N distinct numbers find ANY local minima in the array.
 * local minima means - an element which is smaller than all available neighbour (adjacent element)
 * ip -> { 3, 6, 1, 0, 9, 15, 8 }
 * op -> 0
 */
public class Problem6 {
    public static void run () {
        int arr[] = new int[] { 3, 6, 1, 10, 9, 15, 8 };
        System.out.println(getLocalMinima(arr));
    }
    public static int getLocalMinima(int [] arr) {
        int start = 1; // because one side is empty, no point to consider zero index
        int end = arr.length - 2; //because one side is empty, no point to consider last index
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
