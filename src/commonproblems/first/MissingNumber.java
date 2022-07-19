package commonproblems.first;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (Integer num : nums) set.add(num);
        for (int i = 0; i <= set.size(); i++) {
            if (set.add(i)) return i;
        }
        return 0;
    }

}
