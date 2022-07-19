package commonproblems.first;

import java.util.*;

public class FindCenterOfStarGraph {

    public int findCenter(int[][] edges) {
        Map<Integer, List<Integer>> graphMap = new LinkedHashMap<>();
        for (int[] edge : edges) {
            if (!graphMap.containsKey(edge[0])) graphMap.put(edge[0], new ArrayList<>());
            if (!graphMap.containsKey(edge[1])) graphMap.put(edge[1], new ArrayList<>());
            graphMap.get(edge[0]).add(edge[1]);
            graphMap.get(edge[1]).add(edge[0]);
        }
        for (Map.Entry<Integer, List<Integer>> entry : graphMap.entrySet()) {
            if (entry.getValue().size() == edges.length) return entry.getKey();
        }
        return 0;
    }

}
