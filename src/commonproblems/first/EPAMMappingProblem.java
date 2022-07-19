package commonproblems.first;

import java.util.*;

public class EPAMMappingProblem {

    private static Map<Character, List<Integer>> solveFirstProblem(Character[] characters, Integer[] numbers) {
        Map<Character, List<Integer>> resultMap = new HashMap<>();
        int j = 0;
        for(int i = 0; i < characters.length - 1; i++) {
            List<Integer> tempList = new ArrayList<>();
            j = 3 * i;
            for(; j <= 3 * i + 2; j++) {
                tempList.add(numbers[j]);
            }
            resultMap.put(characters[i], tempList);
        }
        List<Integer> remainingElementsList = new ArrayList<>(Arrays.asList(numbers).subList(j + 1, numbers.length));
        resultMap.put(characters[characters.length - 1], remainingElementsList);
        return resultMap;
    }

}

