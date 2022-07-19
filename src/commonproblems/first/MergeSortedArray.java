package commonproblems.first;

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length == 0) nums1 = nums2;
        else if (nums2.length == 0) return;
        int i = 0, j = 0;
        while (nums1[i] != 0 && j < n) {
            if (nums1[i] > nums2[j]) {
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                j++;
            }
            i++;
        }
        Arrays.sort(nums2);
        for (int k = 0; k < n; k++) {
            nums1[m + k] = nums2[k];
        }
        Arrays.sort(nums1);
    }

}
