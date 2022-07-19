package commonproblems.first;

public class KeepMultiplyingFoundValuesByTwo {

    public static int findFinalValue(int[] nums, int original) {
        boolean isFound  = false;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == original) {
                isFound = true;
                index = i;
                break;
            }
        }
        if (isFound) return findFinalValue(nums, nums[index] * 2);
        else return original;
    }

}
