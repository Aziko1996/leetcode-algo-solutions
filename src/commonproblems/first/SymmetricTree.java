package commonproblems.first;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

    public boolean isSymmetricTreeUsingTraversal(TreeNode root) {
        Queue<TreeNode> leftQueue = new LinkedList<>();
        Queue<TreeNode> rightQueue = new LinkedList<>();
        leftQueue.add(root);
        rightQueue.add(root);
        while(!leftQueue.isEmpty() && !rightQueue.isEmpty()) {
            TreeNode left = leftQueue.poll();
            TreeNode right = rightQueue.poll();
            if (left == null && right == null) continue;
            if (left == null || right == null) return false;
            if (left.val != right.val) return false;
            leftQueue.offer(left.left);
            leftQueue.offer(left.right);
            rightQueue.offer(right.right);
            rightQueue.offer(right.left);
        }
        return true;
    }

    public boolean isSymmetricRecursive(TreeNode root) {
        return isMirrorTree(root.left, root.right);
    }

    public boolean isMirrorTree(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) return true;
        else if (leftNode == null || rightNode == null) return false;
        if (leftNode.val != rightNode.val) return false;
        return isMirrorTree(leftNode.left, rightNode.right) && isMirrorTree(leftNode.right, rightNode.left);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
