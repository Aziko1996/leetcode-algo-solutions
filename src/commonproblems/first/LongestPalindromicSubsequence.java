package commonproblems.first;

public class LongestPalindromicSubsequence {

    // Time complexity: O(n * n)
    // Space complexity: O(n * n)

    public static int longestPalindromeSubsequence(String s) {
        int n = s.length();
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            table[i][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                int k = i + j - 1;
                if (s.charAt(j) == s.charAt(k) && i == 2) table[j][k] = 2;
                else if (s.charAt(j) == s.charAt(k)) table[j][k] = table[j + 1][k - 1] + 2;
                else table[j][k] = Math.max(table[j + 1][k], table[j][k - 1]);
            }
        }
        return table[0][n - 1];
    }

}
