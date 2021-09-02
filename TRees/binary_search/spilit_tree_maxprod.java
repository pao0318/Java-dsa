import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    int sum=0;
    int max=0;
    public int solve(Tree root) {
        sum=getnode(root);
        findpro(root);
        return max;

    }
    int getnode(Tree root){
        if(root==null)
            return 0;
        return root.val+getnode(root.left)+getnode(root.right);

    }
    int findpro(Tree root){
        if(root==null) return 0;
        int subsum=root.val+findpro(root.left)+findpro(root.right);
        int sum2=(sum-subsum);
        max=Math.max(max,(sum2*subsum));
        return subsum;
    }

}
