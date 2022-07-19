package commonproblems.first;

import java.util.*;

public class FindIfPathExistsInGraph {

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graphMap = new LinkedHashMap<>();
        Map<Integer, Boolean> visitedVertexesMap = new LinkedHashMap<>();
        Stack<Integer> vertexTraversalStack = new Stack<>();
        for (int[] edge : edges) {
            if (!graphMap.containsKey(edge[0])) graphMap.put(edge[0], new ArrayList<>());
            if (!graphMap.containsKey(edge[1])) graphMap.put(edge[1], new ArrayList<>());
            graphMap.get(edge[0]).add(edge[1]);
            graphMap.get(edge[1]).add(edge[0]);
        }
        vertexTraversalStack.push(source);
        visitedVertexesMap.put(source, true);
        while (vertexTraversalStack.size() > 0) {
            Integer currentVertex = vertexTraversalStack.pop();
            if (currentVertex == destination) return true;
            graphMap.get(currentVertex).forEach(vertex -> {
                if (visitedVertexesMap.get(vertex) == null) {
                    vertexTraversalStack.push(vertex);
                    visitedVertexesMap.put(vertex, true);
                }
            });
        }
        return false;
    }

}
