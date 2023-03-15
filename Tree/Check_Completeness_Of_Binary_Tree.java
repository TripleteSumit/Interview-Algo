import java.util.LinkedList;
import java.util.Queue;

public class Check_Completeness_Of_Binary_Tree {
    // Using BFS
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        boolean past = false; // it checks that whether the current element see any null value till now or not
        while (!q.isEmpty()) {
            TreeNode tempRoot = q.poll();

            if (tempRoot == null)
                past = true;
            else {
                if (past)
                    return false;

                q.add(tempRoot.left);
                q.add(tempRoot.right);
            }
        }
        return true;
    }

    // Using DFS
    public boolean isCompleteBT(TreeNode root) {
        return check(root, 0, countNodes(root));
    }

    private int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private boolean check(TreeNode root, int indx, int nodes) {
        if (root == null)
            return true;

        if (indx >= nodes)
            return false;

        return check(root.left, 2 * indx + 1, nodes) && check(root.right, 2 * indx + 2, nodes);
    }
}
