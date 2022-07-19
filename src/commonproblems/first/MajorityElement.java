package commonproblems.first;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        Set<Integer> set = new LinkedHashSet<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) set.add(nums[i]);
        for (Integer num : set) map.put(num, 0);
        for (int i = 0; i < nums.length; i++) map.put(nums[i], map.get(nums[i]) + 1);
        for (Map.Entry<Integer, Integer> mapElement : map.entrySet()) {
            if (mapElement.getValue() > nums.length / 2) result = mapElement.getKey();
        }
        return result;
    }

    /*public int majorityElementOptimal(int[] nums) {

    }*/
}
