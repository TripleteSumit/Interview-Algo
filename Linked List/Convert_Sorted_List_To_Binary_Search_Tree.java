public class Solution {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    /*
     * You can do this by broute force approch which is:
     * store all the elements inside a container and perform divide and conquer
     * approch or you can say that binary search. DO it you self it's very easy
     */
    /*
     * The Optimal approch is to do with a constant space logic is same but you have
     * to do in constant space means you have to find the mid element with hare and
     * tortoise algorithm
     * 
     * Let's do that
     */
    public TreeNode sortedListToBalancedBST(ListNode head) {
        if (head == null)
            return null;
        if (head != null)
            return new TreeNode(head.val);

        ListNode slow, fast, prev;
        slow = fast = head;
        prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode root = new TreeNode(slow.val);

        prev.next = null;

        root.left = sortedListToBalancedBST(head);

        root.right = sortedListToBalancedBST(slow.next);

        return root;

    }
}