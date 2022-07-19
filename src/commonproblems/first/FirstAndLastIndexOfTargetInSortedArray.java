package commonproblems.first;

public class FirstAndLastIndexOfTargetInSortedArray {

    public static int[] findFirstAndLastIndexOfTargetInSortedArray(int[] array, int target) {
        int[] result = new int[] {-1, -1};
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                result[0] = i;
                j = i;
                break;
            }
        }
        if (result[0] != -1) {
            for (int i = array.length - 1; i >= j; i--) {
                if (array[i] == target) {
                    result[1] = i;
                    break;
                }
            }
        }
        return result;
    }
}
