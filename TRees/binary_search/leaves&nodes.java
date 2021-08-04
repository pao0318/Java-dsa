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
    int leaves=0;
    int nodes=0;
    public int[] solve(Tree root) {
         traverse(root);
        return new int[] {leaves, nodes};
    }
      public void traverse(Tree root) {
        if (root == null)
            return;

        if(root.left!=null||root.right!=null)
            nodes++;
        else
            leaves++;
        traverse(root.left);
        traverse(root.right);            
      }
}
