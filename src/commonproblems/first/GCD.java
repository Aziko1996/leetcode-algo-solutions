package commonproblems.first;

public class GCD {

    public static int findGCD(int m, int n) {
        if (m > n) {
            int remainder = m % n;
            if (remainder == 0) return n;
            else {
                m = n;
                n = remainder;
                return findGCD(m, n);
            }
        } else {
            int remainder = n % m;
            if (remainder == 0) return m;
            else {
                n = m;
                m = remainder;
                return findGCD(m ,n);
            }
        }
    }

}
