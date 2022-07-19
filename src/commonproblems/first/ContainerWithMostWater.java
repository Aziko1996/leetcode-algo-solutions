package commonproblems.first;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE, i = 0, j = height.length - 1;
        while (i < j) {
            int min = Math.min(height[i], height[j]);
            max = Math.max(max, min * (j - i));
            if (height[i] < height[j]) i++;
            else j--;
        }
        return max;
    }

}
