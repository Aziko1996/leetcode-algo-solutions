package datastructures.graphs;

import java.util.*;

public class ShortestPathProblem {

    /*public static void main(String[] args) {
        Character[][] edges = new Character[][]{{'a', 'c'}, {'a', 'b'}, {'c', 'b'}, {'c', 'd'}, {'b', 'd'}, {'e', 'd'}, {'g', 'f'}};
        System.out.println(shortestPath(edges, 'b', 'g'));
    }*/

    private static int shortestPath(Character[][] edges, Character start, Character destination) {
        Map<Character, List<Character>> graph = buildGraph(edges);
        Set<Character> visitedNodes = new HashSet<>();
        Queue<AbstractMap.SimpleEntry<Character, Integer>> queue = new LinkedList<>();
        visitedNodes.add(start);
        AbstractMap.SimpleEntry<Character, Integer> distanceFromSourceMap = new AbstractMap.SimpleEntry<>(start, 0);
        queue.add(distanceFromSourceMap);
        while (queue.size() > 0) {
            AbstractMap.SimpleEntry<Character, Integer> currentDistanceTuple = queue.poll();
            Character currentVertex = currentDistanceTuple.getKey();
            if (currentVertex == destination) return currentDistanceTuple.getValue();
            for (Character currentVertexNeighbor : graph.get(currentVertex)) {
                if (visitedNodes.add(currentVertexNeighbor)) {
                    Integer currentVertexDistanceFromStart = currentDistanceTuple.getValue();
                    currentVertexDistanceFromStart++;
                    queue.add(new AbstractMap.SimpleEntry<>(currentVertexNeighbor, currentVertexDistanceFromStart));
                }
            }
        }
        return -1;
    }

    private static LinkedHashMap<Character, List<Character>> buildGraph(Character[][] edges) {
        LinkedHashMap<Character, List<Character>> graph = new LinkedHashMap<>();
        for (Character[] edge : edges) {
            if (!graph.containsKey(edge[0])) graph.put(edge[0], new ArrayList<>());
            if (!graph.containsKey(edge[1])) graph.put(edge[1], new ArrayList<>());
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return graph;
    }

}
