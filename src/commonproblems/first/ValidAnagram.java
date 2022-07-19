package commonproblems.first;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        if (s.length() == 0) return false;
        Map<Character, Integer> firstMap = new LinkedHashMap<>();
        Map<Character, Integer> secondMap = new LinkedHashMap<>();
        char[] firstChars = s.toCharArray();
        char[] secondChars = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            firstMap.put(firstChars[i], 0);
            secondMap.put(secondChars[i], 0);
        }
        for (int i = 0; i < s.length(); i++) {
            firstMap.put(firstChars[i], firstMap.get(firstChars[i]) + 1);
            secondMap.put(secondChars[i], secondMap.get(secondChars[i]) + 1);
        }
        for (int j = 0; j < s.length(); j++) {
            if (!Objects.equals(firstMap.get(firstChars[j]), secondMap.get(firstChars[j]))) return false;
        }
        return true;
    }

}
