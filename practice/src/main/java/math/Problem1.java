package math;

/**
 * find the Greatest Common Divisor (GCD) of two numbers
 * find the Highest Common Factor (HCF) of two numbers
 * Program to Find GCD or HCF of Two Numbers
 *
 */

public class Problem1 {
    public static void run() {
        System.out.println(getGreatestCommonDivisor(25, 30));
        System.out.println(getGreatestCommonDivisor(20,25, 30));
    }

    public static int getGreatestCommonDivisor(int a, int b) {
        if (a == 0) {
            return b;
        }
        return getGreatestCommonDivisor(b%a, a);
    }
    /*
    Tc -> O(log max(a,b)
        or O(log n)  note: the logarithm is not base 2
     */
    //variant
    //with three numbers
    public static int getGreatestCommonDivisor(int a, int b, int c) {
        return getGreatestCommonDivisor(getGreatestCommonDivisor(a,b), c);
    }

}
