package commonproblems.first;

public class MaximumSubArray {

    public static int maxSubArray(int[] nums) {

        int[] subResultsTable  = new int[nums.length];
        int max = nums[0];
        subResultsTable[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            subResultsTable[i] = Math.max(nums[i], nums[i] + subResultsTable[i - 1]);
            max = Math.max(subResultsTable[i], max);
        }
        return max;

    }

}
