// https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/submissions/
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
    
    public TreeNode createTree(int inStart,int inEnd,int[]inorder, int poStart,int poEnd,int[]postorder,Map<Integer,Integer> map){
        if(poStart>poEnd || inStart>inEnd)
            return null;
        
       
        TreeNode root=new TreeNode(postorder[poEnd]);
        int inRoot=map.get(postorder[poEnd]);
        int n_elements=inRoot-inStart;
        root.left=createTree(inStart, inRoot-1, inorder, poStart,poStart+n_elements-1,postorder,map);
        root.right=createTree(inRoot+1,inEnd,inorder, poStart+n_elements, poEnd-1,postorder,map);
        
        return root;
        
        
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            map.put(inorder[i],i);
        
        int inStart=0;
        int inEnd=inorder.length-1;
        int poStart=0;
        int poEnd=postorder.length-1;
        
       return createTree(inStart,inEnd,inorder,poStart,poEnd,postorder,map);
    }
}
