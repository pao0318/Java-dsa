// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd

import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(LLNode l0, LLNode l1) {
        if(l1==null)
            return l0;
        if(l0==null)
            return l1;

        l0.next=solve(l1,l0.next);
        return l0;
    }
}
