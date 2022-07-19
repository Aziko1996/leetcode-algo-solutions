package commonproblems.first;

public class BalancedBinaryTree {

    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int leftSubTreeHeight, rightSubTreeHeight;
        leftSubTreeHeight = height(root.left);
        rightSubTreeHeight = height(root.right);
        return (Math.abs(leftSubTreeHeight - rightSubTreeHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right));
    }

    private static int height(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    private static class TreeNode {
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
