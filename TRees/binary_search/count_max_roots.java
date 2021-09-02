import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    int c=0;
    public int solve(Tree root) {
        helper(root);
        return c;
    }
    int helper(Tree root){
        if(root==null) return 0;
        int l=helper(root.left);
        int r=helper(root.right);
        if(root.val>=Math.max(l,r))
            c++;
        return Math.max(root.val,Math.max(l,r));    
        
        
    }
}
