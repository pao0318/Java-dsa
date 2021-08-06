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
    public Tree solve(Tree root) {
        if (root == null)
            return root;

        solve(root.left);
        solve(root.right);

        if (root.right != null)
            root.val += root.right.val;
        if (root.left != null)
            root.val += root.left.val;

        return root;
    }
}
