package commonproblems.first;

public class UniquePath {

    // Time complexity = O(m * n)
    // Space complexity =O(m * n)
    public static int uniquePath(int m, int n) {
        int[][] subResultsTable = new int[m][n];
        for (int i = 0; i < m ; i++) {
            subResultsTable[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            subResultsTable[0][j] = 1;
        }
        for (int k = 1; k < m; k++) {
            for (int l = 1; l < n; l++) {
                subResultsTable[k][l] = subResultsTable[k - 1][l] + subResultsTable[k][l - 1];
            }
        }
        return subResultsTable[m - 1][n - 1];
    }

}
