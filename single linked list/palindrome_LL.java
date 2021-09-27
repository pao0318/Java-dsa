import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public boolean solve(LLNode node) {
        LLNode slow=node;
        LLNode fast=node;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null)
            slow=slow.next;

        slow=rev(slow);
        fast=node;    

        while(slow!=null){
            if(fast.val!=slow.val)
                return false;
            slow=slow.next;
            fast=fast.next;    

        }
        return true;
    }
    public LLNode rev(LLNode node){
        LLNode prev=null;
        while(node!=null){
            LLNode next=node.next;
            node.next=prev;
            prev=node;
            node=next;
        }
        return prev;
    }
    
}
