class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=j;
        int[]arr=new int[nums.length];
        while(i<=j){
            if(Math.abs(nums[j])>Math.abs(nums[i])){
                arr[k--]=nums[j]*nums[j];
                j--;
                
            }
            else{
                arr[k--]=(nums[i]*nums[i]);
                i++;
            }
        }
        
            
       return arr;
        
        
    }
}
