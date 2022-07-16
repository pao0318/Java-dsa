// https://www.interviewbit.com/problems/path-to-given-node/
public class Solution {
    List<Integer> res=new ArrayList<>();
    public int[] solve(TreeNode A, int B) {
        helper(A,B);
        int[]ans= new int[res.size()];
        
        int idx=0;
        for(Integer it:res)
            ans[idx++]=it;
        
        return ans;
    }
    public boolean helper(TreeNode node, int target){
        if(node==null)
            return false;
        
        res.add(node.val);
        if(node.val==target)
            return true;
        
        if(helper(node.left,target)|| helper (node.right,target))
            return true;
        else{
            res.remove(res.size()-1);
            return false;
        }
        
        
        
    }
}
