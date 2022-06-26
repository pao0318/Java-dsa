// https://leetcode.com/problems/combination-sum/
class Solution {
 
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
           List<List<Integer>> res= new ArrayList<>();
        List<Integer> temp= new ArrayList<>();
        helper(0,candidates,target,temp,res);
        
        return res;
    }
    
    
    public void helper(int ind,int[]candidates, int target,List<Integer>temp,List<List<Integer>> res){
        if(ind==candidates.length){
            if(target==0){
                res.add(new ArrayList<>(temp));
            }
            return;
        }
        
        if(candidates[ind]<=target){
            temp.add(candidates[ind]);
            helper(ind,candidates,target-candidates[ind],temp,res);
            temp.remove(temp.size()-1);
        }
        helper(ind+1,candidates,target,temp,res);
    }
}
