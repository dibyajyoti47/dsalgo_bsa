package prefix_sum;

/**
 * Range Sum Queries without updates
 * Given an array arr of integers of size n. We need to compute the sum of elements from index i to index j.
 * The queries consisting of i and j index values will be executed multiple times.
 *
 * ip : {1,2,3,4,5}
 * ip i=1, j=3, op: 9
 * ip i=2, j=4, op:12
 */

public class Problem1 {

    public static void run() {
        int arr[] = { 1, 2, 3,  4,  5 };
//      int pre[] = { 1, 3, 6, 10, 15 };
        int i = 2; int j = 4;

        int n = arr.length;
        int pre[] = new int[n];
        preCompute(arr, n, pre);
        if(i == 0) {
            System.out.println(pre[j]);
        } else {
            System.out.println(pre[j] - pre[i-1]);
        }

    }

    public static void preCompute(int arr[], int n,int pre[]) {
        pre[0] = arr[0];
        for (int i = 1; i < n; i++){
            pre[i] = pre[i-1] + arr[i];
        }
    }

}
