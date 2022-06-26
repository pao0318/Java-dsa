// https://leetcode.com/problems/combination-sum-ii/
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res= new ArrayList<>();
        helper(0,target,candidates,new ArrayList<>(), res);

        return res;
    }

    public void helper(int ind, int target, int[]candidates,List<Integer>temp, List<List<Integer>> res){
            if(target==0){
                res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind;i<candidates.length;i++){
            if(i>ind && candidates[i]==candidates[i-1])
                continue;
            if(candidates[i]>target)
                break;
        
            temp.add(candidates[i]);
            helper(i+1,target-candidates[i],candidates,temp,res);
            temp.remove(temp.size()-1);
        }
    }
}
