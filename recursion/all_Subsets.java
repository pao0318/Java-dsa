class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        solve(nums,new ArrayList<>(),0,n);
        return ans;
    }
    void solve(int[] nums,List<Integer> cur,int x,int n){
        if(x == n){ 
            ans.add(new ArrayList<>(cur));
            return;
        }
        List<Integer> temp=new ArrayList<>(cur);
        temp.add(nums[x]);
        solve(nums,cur,x+1,n);
        solve(nums,temp,x+1,n);
        return;
    }
}
