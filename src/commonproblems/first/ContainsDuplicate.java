package commonproblems.first;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int number : nums) {
            if (!set.add(number)) {
                return true;
            }
        }
        return false;
    }

}
