import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public boolean solve(LLNode head) {
        
        while(head.next!=null){
            if(head.val>=head.next.val)
                return false;
                head=head.next;
        }
        return true;
    }
}
