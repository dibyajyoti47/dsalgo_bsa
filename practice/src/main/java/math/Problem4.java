package math;

/**
 * Find number of factors of a given number is odd or even.
 * 15 -> 1,3,5,15  :   here total number of factors is 4 so it is even
 * 64 -> 1, 2, 4, 8, 16, 32, 64   :   here the total number factors 7, so odd.
 */
public class Problem4 {
    public static void run() {
        int n = 15;
        System.out.println( n % Math.sqrt(n) == 0 ? "Odd" : "Even" );
    }
}
