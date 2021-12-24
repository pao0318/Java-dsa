// https://leetcode.com/problems/binary-tree-level-order-traversal/
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        
        Queue<TreeNode> pq=new LinkedList<>();
        pq.add(root);
        while(!pq.isEmpty()){
            int size=pq.size();
            List<Integer> list=new ArrayList<>();
            while(size-->0){
                TreeNode temp=pq.poll();
                list.add(temp.val);
                if(temp.left!=null)
                    pq.add(temp.left);
                if(temp.right!=null)
                    pq.add(temp.right);
            }
            
            res.add(list);
        }
        return res;
    }
}
