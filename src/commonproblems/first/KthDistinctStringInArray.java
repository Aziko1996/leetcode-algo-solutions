package commonproblems.first;

import java.util.*;

public class KthDistinctStringInArray {

    public static String kthDistinct(String[] arr, int k) {
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        int counter = 0;
        for (String string : arr) {
            if (set.add(string)) map.put(string, 1);
            else if (!set.add(string)) map.put(string, map.get(string) + 1);
        }
        System.out.println(Arrays.toString( new Map[] { map } ));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) counter++;
            if (counter == k) return entry.getKey();
        }
        return "";
    }

}
