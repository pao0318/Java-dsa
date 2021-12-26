// https://leetcode.com/problems/invert-binary-tree/
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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return null;
        TreeNode res=new TreeNode(root.val);
        invert(root,res);
        return res;
    }
    public void invert(TreeNode root, TreeNode res){
        if(root==null)
            return;
        
        if(root.left!=null){
            res.right=new TreeNode(root.left.val);
            
        }
        if(root.right!=null){
            res.left=new TreeNode(root.right.val);
            
        }
        invert(root.left,res.right);
        invert(root.right,res.left);
        
        
    }
}
