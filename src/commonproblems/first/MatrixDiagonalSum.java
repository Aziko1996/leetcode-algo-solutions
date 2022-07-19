package commonproblems.first;

public class MatrixDiagonalSum {

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public int diagonalSum(int[][] mat) {
        int result = 0;
        for (int i = 0; i < mat.length; i++) {
            result = result + mat[i][i] + mat[mat.length - i - 1][i];
        }
        if (mat[0].length % 2 == 0) return result;
        return result - mat[mat.length / 2][mat.length / 2];
    }

}
