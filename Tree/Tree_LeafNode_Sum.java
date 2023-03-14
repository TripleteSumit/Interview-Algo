public class Solution {
    int total = 0;

    public int leafSum(TreeNode root) {
        sum(root, 0);
        return total;
    }

    private void sum(TreeNode root, int num) {
        if (root == null)
            return;

        num += root.val;

        if (root.left == null && root.right == null) {
            total += num;
            return;
        }

        sum(root.left, num);
        sum(root.right, num);
        return;
    }
}