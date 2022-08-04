package commonproblems.first;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MinimumWindowSubstring {

    public static void main(String[] args) {
        System.out.println(minWindow("bbaa", "aba"));
    }

    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        int left = 0, right = 0, have = 0, need = t.length(), resultLength = Integer.MAX_VALUE, count;
        int[] result = new int[2];
        char[] tArray = t.toCharArray();
        char[] sArray = s.toCharArray();
        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < tArray.length; i++) {
            if (!countT.containsKey(tArray[i])) countT.put(tArray[i], 1);
            else {
                count = countT.get(tArray[i]);
                countT.put(tArray[i], ++count);
            }
        }
        for (;right < sArray.length; right++) {
            if (!window.containsKey(sArray[right])) window.put(sArray[right], 1);
            else {
                count = window.get(sArray[right]);
                window.put(sArray[right], ++count);
            }
            if (countT.containsKey(sArray[right]) && countT.get(sArray[right]) >= window.get(sArray[right])) have++;
            while (need == have) {
                if ((right - left + 1) < resultLength) {
                    result[0] = left;
                    result[1] = right;
                    resultLength = right - left + 1;
                }
                count = window.get(sArray[left]);
                window.put(sArray[left], --count);
                if (countT.containsKey(sArray[left]) && window.get(sArray[left]) < countT.get(sArray[left])) have--;
                left++;
            }
        }
        if (resultLength < Integer.MAX_VALUE) return s.substring(result[0], result[1] + 1);
        return "";
    }

}
