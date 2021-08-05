// https://binarysearch.com/problems/Count-Nodes-in-Complete-Binary-Tree
import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public int solve(Tree tree) {
        if(tree==null)
            return 0;
            // right calls
        int r_levels=1;
        Tree r=tree.right;
        while(r!=null){
            r=r.right;
            r_levels++;
        }
        // left calls
        int l_levels=1;
        Tree l=tree.left;
        while(l!=null){
            l=l.left;
            l_levels++;
        }

        if(l_levels==r_levels)
            return (int)Math.pow(2,l_levels)-1;


        return 1+solve(tree.left)+solve(tree.right);
} 
}
