package commonproblems.first;

public class IsSubsequence {

    // Time complexity: O(n)
    // Space complexity: O(1)

    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int position = 0;
        for (int i = 0; i < t.length(); i++) {
            if (position <= s.length() - 1) {
                if (t.charAt(i) == s.charAt(position)) position++;
            } else {
                break;
            }
        }
        return s.length() == position;
    }

}
