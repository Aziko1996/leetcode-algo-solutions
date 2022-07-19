package commonproblems.first;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {

    // Time Complexity = O(n)
    // Space Complexity = O(1)

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int index;
        for (int i = 0; i < nums.length; i++) {
            index = Math.abs(nums[i]) - 1;
            nums[index] = nums[index] * -1;
            if (nums[index] > 0) {
                result.add(Math.abs(nums[i]));
            }
        }
        return result;
    }

}
