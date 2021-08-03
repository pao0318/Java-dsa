// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd
import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public int solve(LLNode node, int k) {
        LLNode head=node;
        while(k-->0)
            head=head.next;
    
    
    LLNode curr=node;
    while(head!=null && head.next!=null){
        head=head.next;
        curr=curr.next;
    }
    return curr.val;

    }
}

