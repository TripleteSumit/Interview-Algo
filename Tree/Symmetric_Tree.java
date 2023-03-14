public class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        thils.right = right;
    }
}

public class Solution {
    public boolean isSymmentric(TreeNode root) {
        return check(root, root)
    }

    private boolean check(TreeNode left, TreeNode right) {
        if (left == null || right == null)
            return left.val == right.val;
        if (left.val != right.val)
            return false;
        return check(left.left, right.right) && check(left.right, right.left);
    }
}