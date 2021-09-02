import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {

       boolean helper(Tree source, Tree target){
        if(source==null && target==null) return true;
        if(source==null||target==null) return false;
        

        boolean x=false;
        if(source.val==target.val){
            x=(helper(source.left,target.left)&&helper(source.right,target.right))||
                (helper(source.right,target.left) && helper(source.left,target.right));
        }
        return x;  

    }
    public boolean solve(Tree source, Tree target) {

        if(source==null||target==null) return false;
        if(source==null && target==null) return true;

        boolean x=false;
        x=helper(source,target);
        if(x)return true;
        else
            x=solve(source,target.left)||solve(source,target.right);
        return x;

        }
       
    
 
}
