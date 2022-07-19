package commonproblems.first;

import java.util.*;

public class GroupAnagrams {

    // Time complexity: O(nmlogm)

    public static List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();
        for (String string : strings) {
            char[] characters = string.toCharArray();
            Arrays.sort(characters);
            String sortedString = new String(characters);
            if (!map.containsKey(sortedString)) map.put(sortedString, new ArrayList<>());
            map.get(sortedString).add(string);
        }
        return new ArrayList<>(map.values());
    }

}
