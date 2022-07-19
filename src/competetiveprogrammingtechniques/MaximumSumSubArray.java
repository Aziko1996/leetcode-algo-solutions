package competetiveprogrammingtechniques;

import java.util.ArrayList;
import java.util.List;

public class MaximumSumSubArray {

    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"1","C"}));
    }

    public static int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<>();
        int result = 0;
        for (String s : ops) {
            if (!s.equals("C") && !s.equals("D") && !s.equals("+")) list.add(Integer.valueOf(s));
            else if (s.equals("+")) list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
            else if (s.equals("D")) list.add(list.get(list.size() - 1) * 2);
            else list.remove(list.size() - 1);
        }
        for (Integer n : list) result += n;
        return result;
    }


}
