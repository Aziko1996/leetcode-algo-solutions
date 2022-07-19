package datastructures.graphs;

import java.util.*;

public class CommonProblems {

    /*public static void main(String[] args) {
        Map<Integer, Integer[]> graph = new LinkedHashMap<>();
        graph.put(1, new Integer[]{2});
        graph.put(2, new Integer[]{1});
        graph.put(4, new Integer[]{6});
        graph.put(6, new Integer[]{5,8,7,4});
        graph.put(5, new Integer[]{6});
        graph.put(8, new Integer[]{6});
        graph.put(7, new Integer[]{6});
        graph.put(3, new Integer[]{});
        graph.put(11, new Integer[]{12,13});
        graph.put(12, new Integer[]{11});
        graph.put(13, new Integer[]{11});
        System.out.println(connectedComponentsCount(graph));
        System.out.println(largestComponent(graph));

    }*/

    public static int connectedComponentsCount(Map<Integer, Integer[]> graph) {
        int connectedComponentsCount = 0;
        Set<Integer> visitedNodes = new HashSet<>();
        for (Map.Entry<Integer, Integer[]> entry : graph.entrySet()) {
            if (observe(entry.getKey(), graph, visitedNodes)) connectedComponentsCount++;
        }
        return connectedComponentsCount;
    }

    public static int largestComponent(Map<Integer, Integer[]> graph) {
        int largestComponent = 0;
        Set<Integer> visitedNodes = new HashSet<>();
        for (Map.Entry<Integer, Integer[]> entry : graph.entrySet()) {
            int size = observeLargestComponent(entry.getKey(), graph, visitedNodes);
            if (size > largestComponent) largestComponent = size;
        }
        return largestComponent;
    }

    private static boolean observe(Integer node, Map<Integer, Integer[]> graph, Set<Integer> visitedNodes) {
        if (!visitedNodes.add(node)) return false;
        visitedNodes.add(node);
        for (Integer neighborNode : graph.get(node)) {
            observe(neighborNode, graph, visitedNodes);
        }
        return true;
    }

    private static int observeLargestComponent(Integer node, Map<Integer, Integer[]> graph, Set<Integer> visitedNodes) {
        if (!visitedNodes.add(node)) return 0;
        int nodesCountInComponent = 1;
        visitedNodes.add(node);
        for (Integer neighborNode : graph.get(node)) {
            nodesCountInComponent += observeLargestComponent(neighborNode, graph, visitedNodes);
        }
        return nodesCountInComponent;
    }

}
