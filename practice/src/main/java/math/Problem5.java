package math;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a number is prime or not.
 * List all the prime numbers from 1 to N.
 */
public class Problem5 {
    public static void run() {
        System.out.println(checkPrime(1));
        listPrime(100);
    }

    public static void listPrime(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(checkPrime(i))
                primes.add(i);
        }
        System.out.println(primes);
    }

    public static boolean checkPrime(int n) {
        for ( int i = 2; i <= Math.sqrt(n); i++ ) {
            if ( n % i == 0 ) {
                return false;
            }
        }
        return true;
    }
}
