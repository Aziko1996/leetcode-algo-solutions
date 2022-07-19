package commonproblems.first;

public class ClimbingStairs {

    public int climbStairs(int n) {
        int[] subResultsTable = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1 || i == 2) {
                subResultsTable[i] = i;
            } else {
                subResultsTable[i] = subResultsTable[i - 2] + subResultsTable[i - 1] + 1;
            }
        }
        return subResultsTable[n - 1] + 1;
    }

}
