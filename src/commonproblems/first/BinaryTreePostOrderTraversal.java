package commonproblems.first;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostOrderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        return result;
    }

    public class TreeNode {
        int val;
        BinaryTreeInOrderTraversal.TreeNode left;
        BinaryTreeInOrderTraversal.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, BinaryTreeInOrderTraversal.TreeNode left, BinaryTreeInOrderTraversal.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
