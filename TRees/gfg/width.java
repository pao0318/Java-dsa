class Solution {
    // Function to return the diameter of a Binary Tree.
    int res=0;
    int diameter(Node root) {
        helper(root);
        return res;
    }
    int helper(Node root){
        if(root==null)
            return 0;
        
        int l=helper(root.left);
        int r=helper(root.right);
        res=Math.max(res,l+r+1);
        
        return 1+Math.max(l,r);
        
        
    }
}
