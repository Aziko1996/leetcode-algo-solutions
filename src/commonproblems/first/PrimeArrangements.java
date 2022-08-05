package commonproblems.first;

import java.math.BigInteger;

public class PrimeArrangements {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(numPrimeArrangements(100));
    }

    public static int numPrimeArrangements(int n) {
        int primeCount = 0;
        BigInteger first, second;
        for (int i = 2; i <= n; i++) {
            if (isPrimeNumber(i)) primeCount++;
        }
        first = countPermutations(primeCount);
        second = countPermutations(n - primeCount);
        first = first.multiply(second);
        if (first.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) < 0) return first.intValue();
        return first.mod(new BigInteger(String.valueOf((int) (Math.pow(10, 9) + 7)))).intValue();
    }

    private static boolean isPrimeNumber(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static BigInteger countPermutations(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

}
