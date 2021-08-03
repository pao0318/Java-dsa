https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd

import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public Tree solve(Tree root) {
        Tree base=root;
        if(root==null)
            return null;
          Tree temp;
        temp=root.right;
        root.right=root.left;
        root.left=temp;
        // Tree base=root;
        solve(root.left);
        solve(root.right);

        return base;    
    }

}
