package commonproblems.first;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInOrderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>(0);
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        // Traverse the tree
        while (currentNode != null || stack.size() > 0) {
            // Reach left-most node of the current node
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            // Current node must be null at that point
            currentNode = stack.pop();
            result.add(currentNode.val);
            // We now have visited the node and its subtree. Now it is right subtree's turn
            currentNode = currentNode.right;
        }
        return result;
    }

    public class TreeNode {
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
