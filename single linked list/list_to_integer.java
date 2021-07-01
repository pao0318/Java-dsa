import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public int solve(LLNode node) {
        StringBuilder str=new StringBuilder();
        LLNode current=node;
        while(current!=null){
            str.append(current.val);
            current=current.next;
        }
        return Integer.parseInt(str.toString(),2);
}
}
