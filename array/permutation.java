// https://leetcode.com/problems/permutations/submissions/
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList();
        List<Integer> curr=new ArrayList();
        boolean[] visited=new boolean[nums.length];
        helper(res,curr,visited,nums);
        return res;
    }
    public void helper(List<List<Integer>> res,List<Integer>curr,boolean[] visited,int[]nums){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        
        
        for(int i=0;i<nums.length;i++){
            if(visited[i])
                continue;
            visited[i]=true;
            curr.add(nums[i]);
            helper(res,curr,visited,nums);
            curr.remove(curr.size()-1);
            visited[i]=false;
        }
        
    }
}
