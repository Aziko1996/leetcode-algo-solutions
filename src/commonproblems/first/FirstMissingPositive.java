package commonproblems.first;

public class FirstMissingPositive {

    public static int firstMissingPositiveOptimal(int[] nums) {
        if (nums == null || nums.length == 0) return 1;
        int length = nums.length, containsOne = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 1) containsOne = 1;
            else if (nums[i] <= 0 || nums[i] > length) nums[i] = 1;
        }
        if (containsOne == 0) return 1;
        for (int j = 0; j < length; j++) {
            int index = Math.abs(nums[j]) - 1;
            if (nums[index] > 0) nums[index] = -1 * nums[index];
        }
        for (int k = 0; k < length; k++) {
            if (nums[k] > 0) return k + 1;
        }
        return length + 1;
    }

    // 2,3,4,6,8,-10, 1
    // 2,3,4,6,1,1, 1
    // -2,-3,-4,-6,1,-1, 1

}
