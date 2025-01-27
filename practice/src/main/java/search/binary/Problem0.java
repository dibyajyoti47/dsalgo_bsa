package search.binary;

/**
 * implement binary search
 * ip-> {-5,2,3,6,9,10,11,15,18}  target: 9
 * op -> 4th index
 */
public class Problem0 {
    public static void run () {
        int arr[] = {-5,2,3,6,9,10,11,15,18};
        int target = 10;
        int res = binarySearch(arr, target);
        if (res == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at index " + res);
    }

    public static int binarySearch(int a[], int target) {
        int start = 0;
        int end = a.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == target) {
                return mid;
            } else if (a[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
