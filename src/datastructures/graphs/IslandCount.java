package datastructures.graphs;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Set;

public class IslandCount {

    /*public static void main(String[] args) {
        Character[][] grid = new Character[][]{{'W', 'L', 'W', 'W', 'W'}, {'W', 'L', 'W', 'W', 'W'}, {'W', 'W', 'W', 'L', 'W'},
                {'W', 'W', 'L', 'L', 'W'}, {'L', 'W', 'W', 'L', 'L'}, {'L', 'L', 'W', 'W', 'W'}};
        Character[][] secondGrid = new Character[][]{{'L', 'L'}, {'L', 'L'}};
        System.out.println(islandCount(secondGrid));
    }*/

    public static int islandCount(Character[][] grid) {
        Set<AbstractMap.SimpleEntry<Integer, Integer>> visited = new HashSet<>();
        int result = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid.length; column++) {
                if (explore(grid, row, column, visited)) result++;
            }
        }
        return result;
    }

    private static boolean explore(Character[][] grid, int row, int column, Set<AbstractMap.SimpleEntry<Integer, Integer>> visited) {
        if (!visited.add(new AbstractMap.SimpleEntry<>(row, column))) return false;
        if (!(row >= 0 && row < grid.length)) return false;
        if (!(column >= 0 && column < grid[0].length)) return false;
        if (grid[row][column] == 'W') return false;
        visited.add(new AbstractMap.SimpleEntry<>(row, column));
        explore(grid, row - 1, column, visited);
        explore(grid, row + 1, column, visited);
        explore(grid, row, column - 1, visited);
        explore(grid, row, column + 1, visited);
        return true;
    }

}
