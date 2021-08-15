// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd
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
        Tree root =new Tree(node.val);
        if (node.next == null)
            return new Tree(node.val);
        if(node.next.val<node.val)
            root.left=solve(node.next);
        else
            root.right=solve(node.next);

        return root;    
                
    }
   
}
