import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {

    int count=0;
    public int solve(Tree root) {

        summing(root);
        return count;
        }
    public int summing(Tree root){
        if(root==null)
            return 0;
        int L=summing(root.left);
        int R=summing(root.right);
        if(root.left!=null && root.right!=null){
        if( L%2!=R%2)
            count++;
        
         }
        return root.val+L+R;

    }
    
}
