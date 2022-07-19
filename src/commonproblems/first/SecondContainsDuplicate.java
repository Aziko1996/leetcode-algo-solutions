package commonproblems.first;

import java.util.LinkedHashMap;
import java.util.Map;

public class SecondContainsDuplicate {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) <= t && Math.abs(i - j) <= k) return true;
            }
        }
        return false;
    }

    // -t <= nums[i] - nums[j] <= t
    // -k <= i - j <= k
    // -(t+k) <= nums[i]+i-nums[j]-j <= t+k

}
