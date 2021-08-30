class Solution {
    int count=0;
    public int solve(Tree root) {
    helper(root);
    return count;

        
    }
    public void helper(Tree root){
        if(root==null)
            return;
        if(root.left!=null &&root.right==null ||root.left==null &&root.right!=null )
            count++;

            helper(root.left);
            helper(root.right);  
    }
}
