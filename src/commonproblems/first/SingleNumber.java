package commonproblems.first;

import java.util.*;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        Set<Integer> set = new LinkedHashSet<>();
        for (Integer num : nums) {
            set.add(num);
        }
        for (Integer numInSet : set.toArray(new Integer[0])) {
            map.put(numInSet, 0);
        }
        for (Integer numInArray : nums) {
            if (map.get(numInArray) == 0) map.put(numInArray, 1);
            else map.put(numInArray, map.get(numInArray) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }
        return 0;
    }

}
