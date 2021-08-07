
class Solution {
    
    public int solve(Tree root) {
        if(root==null)
            return 0;
        int sum=root.val;
        sum+= Math.max(solve(root.left),solve(root.right)); 
        return sum;  
    }
}
