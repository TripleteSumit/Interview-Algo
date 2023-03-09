// Let discuss the intuition behind that code
/*
    1 -> 2 -> 3-> 4 -> 5 -> 6 -> 7 ->
                  |_    _    _   _  _ _|
    
    Suppose slow = l1 + l2;
            fast = l1 + l2 + nk(let's say no of rotation with cycle) ---------> eq-1
    but we know that fast = twice of slow which is 2 * (l1 + l2) -------------> eq-2
    
    compare equation 1 and 2 and we get
    
    => 2 * (l1 + l2) = l1 + l2 + nk;
    
    => l1 + l2 = nk;
    
    => l1 = nk - l2;
    
    it's mean that if we subtract meet points from no of cycle and rotaiton we get the starting point because length is same;
    
*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        //Broute force approch
        ArrayList<ListNode> visited = new ArrayList<>();
        while(head != null && !visited.contains(head))
        {
            visited.add(head);
            head = head.next;
        }
        return head == null ? null : head;
        
        
        /* Optimimal Approach O(1) T.c */
        /*
        ListNode slow, fast;
        slow = fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
                break;
        }
        if(fast == null || fast.next == null)
            return null;
        else
        {
            ListNode start = head;
            while(start != slow)
            {
                start = start.next;
                slow = slow.next;
            }
            return slow;
        }
        */
    }
}
