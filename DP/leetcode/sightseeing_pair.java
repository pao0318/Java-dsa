class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max=values[0];
        int maxindex=0;
        int res=Integer.MIN_VALUE;
        
    
        for(int i=1;i<values.length;i++){
            res=Math.max(res, max+values[i]+maxindex-i);
            if(max+maxindex<values[i]+i){
                max=values[i];
                maxindex=i;
            }
        }
        return res;
        
        
    }
}
