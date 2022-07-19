package commonproblems.first;

import java.util.*;

public class FindTheTownJudge {

    public int findJudge(int n, int[][] trust) {
        if (trust.length == 0 && n == 1) return 1;
        if (n - trust.length > 2) return -1;
        Map<Integer, LinkedHashSet<Integer>> graph = new LinkedHashMap<>();
        Set<Integer> persons = new LinkedHashSet<>();
        for (int[] trustPair : trust) {
            if (!graph.containsKey(trustPair[0])) graph.put(trustPair[0], new LinkedHashSet<>());
            graph.get(trustPair[0]).add(trustPair[1]);
            persons.add(trustPair[0]);
            persons.add(trustPair[1]);
        }
        for (Integer person : persons) {
            if (!graph.containsKey(person)) {
                int counter = 0;
                for (Map.Entry<Integer, LinkedHashSet<Integer>> entry : graph.entrySet()) {
                    if (!entry.getValue().add(person)) counter++;
                }
                if (counter == n - 1) return person;
            }
        }
        return -1;
    }

}
