// https://leetcode.com/problems/path-sum/
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
    static int target;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        target=targetSum;
        if(root==null)
            return false;
        return solve(root,0);
    }
    private boolean solve(TreeNode root,int sum){
        if(root==null)
            return false;
        if(root.left==null&&root.right==null){
            if(root.val+sum==target)
                return true;
        }    
        return solve(root.left,root.val+sum) ||solve(root.right,root.val+sum);
    }
}
