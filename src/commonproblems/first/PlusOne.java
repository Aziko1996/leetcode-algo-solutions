package commonproblems.first;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int extra;
        int[] resultArray = new int[digits.length + 1];
        for (int i = 0; i < digits.length; i++) {
            resultArray[i + 1] = digits[i];
        }
        if (resultArray[resultArray.length - 1] + 1 == 10) {
            resultArray[resultArray.length - 1] = 0;
            extra = 1;
        } else {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }
        for (int j = resultArray.length - 2; j >= 1; j--) {
            if (resultArray[j] + extra == 10) {
                resultArray[j] = 0;
            } else {
                resultArray[j] = resultArray[j] + extra;
                extra = 0;
                break;
            }
        }
        if (extra == 1) {
            resultArray[0] = 1;
            return resultArray;
        } else {
            return Arrays.copyOfRange(resultArray, 1, resultArray.length);
        }
    }

}
