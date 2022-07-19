package commonproblems.first;

import java.util.Arrays;

public class SortedArrayToBST {

    public static TreeNode sortedArrayToBST(int[] nums) {
        int start = 0, end = nums.length - 1;
        if (start > end) return null;
        int middle = nums.length / 2;
        TreeNode treeNode = new TreeNode(nums[middle]);
        int[] leftArray = Arrays.copyOfRange(nums, start, middle);
        int[] rightArray = Arrays.copyOfRange(nums, middle + 1, end + 1);
        treeNode.left = sortedArrayToBST(leftArray);
        treeNode.right = sortedArrayToBST(rightArray);
        return treeNode;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}