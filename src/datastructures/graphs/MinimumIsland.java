package datastructures.graphs;

import java.util.*;

public class MinimumIsland {

    /*public static void main(String[] args) {
        Character[][] grid = new Character[][]{{'W', 'L', 'W', 'W', 'L', 'W'}, {'L', 'L', 'W', 'W', 'L', 'W'},
                {'W', 'L', 'W', 'W', 'W', 'W'}, {'W', 'W', 'W', 'L', 'L', 'W'}, {'W', 'W', 'W', 'L', 'L', 'W'},
                {'W', 'W', 'W', 'L', 'W', 'W'}};
        Character[][] secondGrid = new Character[][]{{'L', 'L'}, {'W', 'W'}, {'W', 'L'}};
        System.out.println(islandCount(secondGrid));
        System.out.println(islandCount(grid));
    }*/

    public static int islandCount(Character[][] grid) {
        Set<AbstractMap.SimpleEntry<Integer, Integer>> visited = new HashSet<>();
        int result = (int)Double.POSITIVE_INFINITY;
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid.length; column++) {
                int count = explore(grid, row, column, visited);
                if (count < result && count > 0) result = count;
            }
        }
        return result;
    }

    private static int explore(Character[][] grid, int row, int column, Set<AbstractMap.SimpleEntry<Integer, Integer>> visited) {
        if (!visited.add(new AbstractMap.SimpleEntry<>(row, column))) return 0;
        if (!(row >= 0 && row < grid.length)) return 0;
        if (!(column >= 0 && column < grid[0].length)) return 0;
        if (grid[row][column] == 'W') return 0;
        visited.add(new AbstractMap.SimpleEntry<>(row, column));
        return 1 + explore(grid, row - 1, column, visited) + explore(grid, row + 1, column, visited)
                + explore(grid, row, column - 1, visited) + explore(grid, row, column + 1, visited);
    }

}
