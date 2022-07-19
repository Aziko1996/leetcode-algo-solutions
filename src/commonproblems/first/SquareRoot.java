package commonproblems.first;

public class SquareRoot {

    public int mySqrt(int x) {
        long answer = 0, start = 0, end = Integer.MAX_VALUE;
        while (start <= end) {
            long middle = start + (end - start) / 2;
            if (middle * middle <= x) {
                answer = middle;
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return (int) answer;
    }


}
