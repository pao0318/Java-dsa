class Solution {
    public int trap(int[] height) {
        
        if(height.length<2)
            return 0;
        
        int l=0;
        int r=height.length;
        int l_max=height[l];
        int r_max=height[r-1];
        
        int res=0;
        while(l<r){
            if(l_max<r_max){
                l++;
                l_max=Math.max(l_max,height[l]);
                res+=l_max-height[l];
            }
            else{
                r--;
                r_max=Math.max(r_max,height[r]);
                res+=r_max-height[r];
            }
            
        }
        return res;
    }
}
