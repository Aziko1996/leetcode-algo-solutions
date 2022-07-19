package commonproblems.first;

public class GetMaximumInGeneratedArray {

    // Running Time: O(n)
    // Space Complexity: O(n)

    public static int getMaximumGenerated(int n) {
        if (n == 0) return 0;
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        int result = nums[0];
        if (n == 1) return nums[1];
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) nums[i] = nums[i / 2];
            else if (i % 2 == 1) nums[i] = nums[(i - 1) / 2] + nums[(i + 1) / 2];
            if (nums[i] > result) result = nums[i];
        }
        return result;
    }

}
