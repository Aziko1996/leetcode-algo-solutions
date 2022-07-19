package commonproblems.first;

public class SecondJumpGame {


    public static int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int result = 0, i = 0;
        while (i < nums.length - 1) {
            if (nums[i] + i >= nums.length - 1) return ++result;
            for (int j = i + 1; j <= i + nums[i] && j < nums.length - 1; j++) {
                if (nums[j] >= nums[i]) {
                    i = j;
                    result++;
                }
            }
        }
        return result;
    }


}
