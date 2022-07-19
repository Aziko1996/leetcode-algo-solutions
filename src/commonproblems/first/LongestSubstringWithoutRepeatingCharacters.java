package commonproblems.first;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int result = -1;
        StringBuilder test = new StringBuilder();
        if (s.length() == 0) return 0;
        else if (s.length() == 1) return 1;
        for (Character c : s.toCharArray()) {
            String current = String.valueOf(c);
            if (test.toString().contains(current)) {
                test = new StringBuilder(test.substring(test.indexOf(current) + 1));
            }
            test.append(c);
            result = Math.max(test.length(), result);
        }
        return result;
    }

}