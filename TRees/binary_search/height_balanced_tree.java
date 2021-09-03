import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
  
    public boolean solve(Tree root) {
        if(root==null)
            return true;
        return helper(root);
  
    }
    boolean helper(Tree root){
        if(root==null)
            return true;
        int  l=height(root.left);
        int r=height(root.right);
        if(Math.abs(l-r)<=1 && helper(root.left)&&helper(root.right))
            return true;   
        return false;

    }
    int height(Tree root){
        if(root==null)
            return 0;
        return 1+Math.max(height(root.left), height(root.right));    
        
    }
}
