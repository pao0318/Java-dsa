// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd
import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public int solve(Tree root) {
    List<Integer> list=new ArrayList<>();
    int sum=helper(root,0);
    return sum;
    }
    int helper(Tree root,int level){
        if(root==null)
            return 0;
        level=(level*10+root.val);    
        if(root.left==null && root.right==null)
            return level;   

        return helper(root.left,level)+helper(root.right,level);

    }
}
