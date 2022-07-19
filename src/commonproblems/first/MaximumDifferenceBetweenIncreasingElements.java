package commonproblems.first;

public class MaximumDifferenceBetweenIncreasingElements {

    public int maximumDifference(int[] nums) {
        int maximumDifference = -1, minimumNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minimumNumber) minimumNumber = nums[i];
            int difference = nums[i] - minimumNumber;
            if (difference > maximumDifference) maximumDifference = difference;
        }
        if (maximumDifference == 0) return -1;
        return maximumDifference;
    }

}
