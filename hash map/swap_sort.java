import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int ans=0;
        int n=nums.length;
        int []temp=Arrays.copyOfRange(nums,0,nums.length);
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(temp);
        for(int i=0;i<n;i++)
            map.put(nums[i],i);

        for(int i=0;i<n;i++){
            if(nums[i]!=temp[i]){
                int element=nums[i];
                ans++;
                swap(nums,i,map.get(temp[i]));

                map.put(element,map.get(temp[i]));
                map.put(temp[i],i);
            }
        }
        return ans;    
    }
    public void swap(int[] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
