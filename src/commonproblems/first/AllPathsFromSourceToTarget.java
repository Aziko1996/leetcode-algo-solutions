package commonproblems.first;

import java.util.*;

public class AllPathsFromSourceToTarget {

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(Collections.singletonList(0));
        while (!queue.isEmpty()) {
            List<Integer> path = queue.poll();
            int nodeNumber = path.get(path.size() - 1);
            if (nodeNumber == graph.length - 1) result.add(path);
            else {
                for (int neighbor : graph[nodeNumber]) {
                    List<Integer> tempList = new ArrayList<>(path);
                    tempList.add(neighbor);
                    queue.add(tempList);
                }
            }
        }
        return result;
    }

}
