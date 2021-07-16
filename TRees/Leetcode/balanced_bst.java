// https://leetcode.com/problems/balanced-binary-tree/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
  if (root == null)
            return true;
        return isHeightBalanced(root) != -1;
    }

    private int isHeightBalanced(TreeNode root) {
        if (root == null)
            return 0;

        int leftHeight = isHeightBalanced(root.left);
        if (leftHeight < 0)
            return -1;
        int rightHeight = isHeightBalanced(root.right);
        if (rightHeight < 0)
            return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
