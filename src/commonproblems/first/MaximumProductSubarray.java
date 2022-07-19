package commonproblems.first;

public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        int maxProduct = nums[0], minValue = nums[0], maxValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxValue;
                maxValue = minValue;
                minValue = temp;
            }
            maxValue = Math.max(nums[i], maxValue * nums[i]);
            minValue = Math.min(nums[i], minValue * nums[i]);
            maxProduct = Math.max(maxProduct, maxValue);
        }
        return maxProduct;
    }


}
