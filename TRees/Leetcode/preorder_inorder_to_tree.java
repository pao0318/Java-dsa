// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/submissions/
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
     public TreeNode createTree(int preStart, int preEnd, int inStart,int inEnd, int[]pre, int[]in, Map<Integer,Integer>map){
        if(preStart>preEnd || inStart>inEnd)
            return null;

        TreeNode root= new TreeNode(pre[preStart]);
        int inRoot=map.get(pre[preStart]);
        int n_elements=inRoot-inStart;
        root.left=createTree(preStart+1,preStart+n_elements,inStart,inRoot-1,pre,in,map);
        root.right=createTree(preStart+n_elements+1,preEnd,inRoot+1,inEnd,pre,in,map);

    return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer>map= new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            map.put(inorder[i],i);
        int preStart=0;
        int preEnd=preorder.length-1;
        int inStart=0;
        int inEnd=inorder.length-1;
        return createTree(preStart,preEnd,inStart,inEnd, preorder,inorder,map);
    }
}
