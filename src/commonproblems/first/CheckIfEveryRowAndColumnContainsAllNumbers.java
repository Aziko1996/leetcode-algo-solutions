package commonproblems.first;

import java.util.LinkedHashSet;
import java.util.Set;

public class CheckIfEveryRowAndColumnContainsAllNumbers {

    // Time Complexity: O(n2)
    // Space Complexity: O(n)

    public boolean checkValid(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            Set<Integer> setRow = new LinkedHashSet<>();
            Set<Integer> setColumn = new LinkedHashSet<>();
            for (int j = 0; j < matrix.length; j++) {
                setRow.add(matrix[i][j]);
                setColumn.add(matrix[j][i]);
            }
            if (setRow.size() != matrix.length || setColumn.size() != matrix.length) return false;
        }
        return true;
    }

}
