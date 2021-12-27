// https://leetcode.com/problems/triangle/
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int[]dp=new int[triangle.get(triangle.size()-1).size()];
        int idx=0;
        for(int x: triangle.get(triangle.size()-1))
            dp[idx++]=x;
        
        int size1=triangle.size()-2;
        while(size1>=0){
            List<Integer>temp=triangle.get(size1);
            for(int i=0;i<temp.size();i++){
                dp[i]=Math.min(temp.get(i)+dp[i], temp.get(i)+dp[i+1]);
            }
            size1--;
        }
        return dp[0];
    
    }
}
