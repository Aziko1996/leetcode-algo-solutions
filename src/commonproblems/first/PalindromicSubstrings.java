package commonproblems.first;

public class PalindromicSubstrings {

    // Time complexity: O(n * n)
    // Space complexity: O(n * n)

    public static int countSubstrings(String s) {
        if (s.length() == 1) return 1;
        int n = s.length(), result = 0;
        boolean[][] table = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            table[i][i] = true;
            result++;
        }
        for (int j = 0; j < n - 1; j++) {
            if (s.charAt(j) == s.charAt(j + 1)) {
                table[j][j + 1] = true;
                result++;
            }
        }
        for (int subStringsLength = 3; subStringsLength <= n; subStringsLength++) {
            for (int start = 0; start < n - subStringsLength + 1; start++) {
                int end = subStringsLength + start - 1;
                if (s.charAt(start) == s.charAt(end) && table[start + 1][end - 1]) {
                    table[start][end] = true;
                    result++;
                }
            }
        }
        return result;
    }

}
