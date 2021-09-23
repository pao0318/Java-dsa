import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(LLNode node, int target) {
      
      LLNode dummy=new LLNode();
        dummy.next=node;
        LLNode temp=dummy;
        while(temp.next!=null){
            if(temp.next.val==target){
                temp.next=temp.next.next;

            }else{
                temp=temp.next;
            }
        }
        return dummy.next;
          
    }
}
