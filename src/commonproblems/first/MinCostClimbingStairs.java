package commonproblems.first;

public class MinCostClimbingStairs {

    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public static int  minCostClimbingStairs(int[] cost) {
        int[] DP = new int[cost.length + 1];
        DP[0] = 0;
        DP[1] = 0;
        for (int i = 2; i <= cost.length; i++) {
            DP[i] = Math.min(cost[i - 1] + DP[i - 1], cost[i - 2] + DP[i - 2]);
        }
        return DP[cost.length];
    }

    // 1,2,1,10,5,6,7,11 -> top
    // 0,0,1,2,2,7,7,13 -> 14
}
