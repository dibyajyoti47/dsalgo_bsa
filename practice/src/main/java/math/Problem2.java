package math;

import java.util.Random;

/**
 * Implement rand(9) by using rand(6)
 *
 *      1 1    1 2    1 3    1 4    1 5    1 6
 *
 *      2 1    2 2    2 3    2 4    2 5    2 6
 *
 *      3 1    3 2    3 3    3 4    3 5    3 6
 *
 *      4 1    4 2    4 3    4 4    4 5    4 6
 *
 *      5 1    5 2    5 3    5 4    5 5    5 6
 *
 *      6 1    6 2    6 3    6 4    6 5    6 6
 *
 *   formula : n(a-1) + b
 *
 */
public class Problem2 {
    public static void run() {
        int a = rand6();
        int b = rand6();
        int num = 6*(a-1) + b;
        System.out.println((num % 9) + 1);
    }
    public static int rand6() {
        Random rand = new Random();
        int min = 1;
        int max = 6;
        return rand.nextInt(max - min + 1) + min;
    }
}
