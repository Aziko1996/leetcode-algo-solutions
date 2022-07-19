package commonproblems.first;

import java.util.ArrayList;
import java.util.List;

public class SecondPascalsTriangle {

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= rowIndex + 1; i++) {
            List<Integer> tempList = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    tempList.add(1);
                } else {
                    tempList.add(result.get(i - 2).get(j - 1) + result.get(i - 2).get(j));
                }
            }
            result.add(tempList);
        }
        return result.get(result.size() - 1);
    }

}
