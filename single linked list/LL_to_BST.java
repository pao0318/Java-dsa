import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public Tree solve(LLNode node) {
        if(node==null)
            return null;
        LLNode prev=null;
        LLNode slow=node;
        LLNode fast=node;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        Tree res=new Tree();
        res.val=slow.val;

        if(prev!=null){
            prev.next=null;
            res.left=solve(node);
        }
        res.right=solve(slow.next);
        return res;

    }
  


}
