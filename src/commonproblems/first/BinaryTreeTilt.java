package commonproblems.first;

public class BinaryTreeTilt {

    public static void findTilt(TreeNode root) {

    }

    public class TreeNode {
        int val;
        SymmetricTree.TreeNode left;
        SymmetricTree.TreeNode right;

        TreeNode(){}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, SymmetricTree.TreeNode left, SymmetricTree.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
