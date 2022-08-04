package commonproblems.first;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDigitNumberToMaximizeResult {

    public static void main(String[] args) {
        System.out.println(removeDigit("551",
                '5'));
    }

    public static String removeDigit(String number, char digit) {
        char[] chars = number.toCharArray();
        BigInteger maximum = BigInteger.ZERO;
        Map<Character, List<Integer>> map = createPositionsMap(chars);
        StringBuilder stringBuilder = new StringBuilder(number);
        List<Integer> positions = map.get(digit);
        if (positions.size() == 1) return stringBuilder.deleteCharAt(positions.get(0)).toString();
        else {
            for (Integer position : positions) {
                BigInteger temp = new BigInteger(stringBuilder.deleteCharAt(position).toString());
                if (temp.compareTo(maximum) > 0) maximum = temp;
                stringBuilder = new StringBuilder(number);
            }
        }
        return String.valueOf(maximum);
    }

    private static Map<Character, List<Integer>> createPositionsMap(char[] chars) {
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) map.put(chars[i], new ArrayList<>());
            map.get(chars[i]).add(i);
        }
        return map;
    }

}
