package commonproblems.first;

import java.util.*;

public class NetworkDelayTime {

    public static void main(String[] args) {
        System.out.println(networkDelayTime(new int[][]{{2,1,1},{2,3,1},{3,4,1}}, 4,2));
    }

    public static int networkDelayTime(int[][] times, int n, int k) {
        Set<Integer> visitedSet = new HashSet<>();
        Map<Integer, List<AbstractMap.SimpleEntry<Integer, Integer>>> graph = buildGraph(times);
        AbstractMap.SimpleEntry<Integer, Integer> entry = new AbstractMap.SimpleEntry<>(k, 0);
        PriorityQueue<AbstractMap.SimpleEntry<Integer, Integer>> queue
                = new PriorityQueue<>(Map.Entry.comparingByValue());
        queue.add(entry);
        int result = 0;
        while (!queue.isEmpty()) {
            AbstractMap.SimpleEntry<Integer, Integer> oldEntry = queue.poll();
            if (visitedSet.contains(oldEntry.getKey())) continue;
            result = Math.max(result, oldEntry.getValue());
            visitedSet.add(oldEntry.getKey());
            if (graph.get(oldEntry.getKey()) != null) {
                for (AbstractMap.SimpleEntry<Integer, Integer> tempEntry : graph.get(oldEntry.getKey())) {
                    Integer newDistance = oldEntry.getValue() + tempEntry.getValue();
                    AbstractMap.SimpleEntry<Integer, Integer> newEntry
                            = new AbstractMap.SimpleEntry<>(tempEntry.getKey(), newDistance);
                    queue.add(newEntry);
                }
            }
        }
        if (visitedSet.size() == n) return result;
        return -1;
    }

    private static Map<Integer, List<AbstractMap.SimpleEntry<Integer, Integer>>> buildGraph(int[][] times) {
        Map<Integer, List<AbstractMap.SimpleEntry<Integer, Integer>>> map = new HashMap<>();
        for (int[] timeArray : times) {
            if (!map.containsKey(timeArray[0])) map.put(timeArray[0], new ArrayList<>());
            map.get(timeArray[0]).add(new AbstractMap.SimpleEntry<>(timeArray[1], timeArray[2]));
        }
        return map;
    }
}
