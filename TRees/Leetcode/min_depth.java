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
    public int minDepth(TreeNode root) {
        return minHeight(root,0);
    }
    private int minHeight(TreeNode root, int level){
        if(root==null)
            return level;
        level++;
//         not a leaf
        if(root.left == null ) 
            return minHeight(root.right,level);
//         not a leaf
        if(root.right == null)
            return minHeight(root.left,level);
        
        return Math.min(minHeight(root.left,level),minHeight(root.right,level)); 
        
    }
}
