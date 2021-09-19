import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public int solve(LLNode node) {
         LLNode slow=node;
         LLNode fast=node;
         if(node==null)
          return 0;
          // if(fast.next.next==null)
          //   return slow.next.val;
         while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
         }
         return slow.val;
    }
}
// or
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
       
        return slow;
    }
}
