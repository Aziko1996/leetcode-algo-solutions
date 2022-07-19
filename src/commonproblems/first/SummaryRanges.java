package commonproblems.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        StringBuilder tempResult = new StringBuilder();
        tempResult.append(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - 1 == nums[i - 1]) tempResult.append("->").append(nums[i]);
            else tempResult.append(",").append(nums[i]);
        }
        return Arrays
            .stream(tempResult.toString().split(","))
            .map(element -> {
                if (element.contains("->")) {
                    String[] temp = element.split("->");
                    element = temp[0] + "->" + temp[temp.length - 1];
                }
                return element;
            }).collect(Collectors.toList());
    }

    public List<String> summaryRangesOptimal(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        List<String> result = new ArrayList<>();
        int start = 0, incrementCounter = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - 1 == nums[i - 1]) ++incrementCounter;
            else if (nums[i] - 1 != nums[i - 1] && incrementCounter > 0) {
                result.add(nums[start] + "->" + nums[i - 1]);
                start = i;
                incrementCounter = 0;
            } else if (nums[i] - 1 != nums[i - 1] && incrementCounter == 0) {
                result.add("" + nums[start]);
                start = i;
            }
        }
        if (incrementCounter == 0) result.add("" + nums[start]);
        else result.add(nums[start] + "->" + nums[nums.length - 1]);
        return result;
    }
}
