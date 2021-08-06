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
        if (root == null)
            return 0;
        return helper(root, null, null);
    }

    private int helper(Tree node, Tree parent, Tree grand) {
        if (node == null)
            return 0;
        int leftSum = helper(node.left, node, parent);
        int rightSum = helper(node.right, node, parent);
        int sum = 0;
        if (grand != null && grand.val % 2 == 0) {
            sum += node.val;
        }
        return sum + leftSum + rightSum;
    }
}
