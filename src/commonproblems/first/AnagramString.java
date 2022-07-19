package commonproblems.first;

import java.util.*;

public class AnagramString {

    static boolean areStringsAnagram(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) return false;
        Map<Character, Integer> firstMap = new HashMap<>();
        Map<Character, Integer> secondMap = new HashMap<>();
        Set<Integer> firstValuesSet;
        Set<Integer> secondValuesSet;
        for (Character firstChar : firstString.toCharArray()) {
            firstMap.put(firstChar, 0);
        }
        for (Character firstChar : firstString.toCharArray()) {
            firstMap.put(firstChar, firstMap.get(firstChar) + 1);
        }
        for (Character secondChar : secondString.toCharArray()) {
            secondMap.put(secondChar, 0);
        }
        for (Character secondChar : secondString.toCharArray()) {
            secondMap.put(secondChar, secondMap.get(secondChar) + 1);
        }
        firstValuesSet = new HashSet<>(firstMap.values());
        secondValuesSet = new HashSet<>(secondMap.values());
        return firstValuesSet.equals(secondValuesSet) && firstMap.keySet().equals(secondMap.keySet());
    }
}
