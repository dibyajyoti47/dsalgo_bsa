package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Find all factors of a given number
 * 15 -> 1,3,5,15
 * 64 -> 1,2,4, 8, 16, 32, 64
 */
public class Problem3 {
    public static void run() {
        bruteForce(15);
        optimized(64);
    }

    public static void bruteForce(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(n%i == 0) {
                list.add(i);
            }
        }
        System.out.println(list);
    }

    public static void optimized(int n) {
        Set<Integer> list = new TreeSet<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i == 0) {
                list.add(i);
                list.add(n/i);
            }
        }
        System.out.println(list);
    }
}
