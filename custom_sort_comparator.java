import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
        Pair[]arr=new Pair[nums.length];

        for(int i=0;i<nums.length;i++){
            arr[i]=new Pair(nums[i],binarize(nums[i]));
        }
        Sort s=new Sort();
        Arrays.sort(arr,s);

        int[]ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i].x;
        }
        return ans;
    }


    class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }

    int binarize(int dig){
        int c=0;
        while(dig>0){
            c+=dig&1;
            dig>>=1;
        }
        return c;
    }
    static class Sort implements Comparator<Pair>{
        public int compare(Pair a, Pair b){
            if(a.y==b.y)
                return a.x-b.x;
            return a.y-b.y;    
        }
    }
}
