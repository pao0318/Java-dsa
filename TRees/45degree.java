import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    static int cleft;
    static int cright;
    public int solve(Tree root) {
        cleft=0;
        cright=0;
        counter(root,0);
        return(cright-cleft+1);
        
    }
    public void counter(Tree root,int c){
            cleft=Math.min(cleft,c);
            cright=Math.max(cright,c);
            if(root.left!=null)
                counter(root.left,c-1);
            if(root.right!=null)
                counter(root.right,c+1);    
        
    }
        
}
