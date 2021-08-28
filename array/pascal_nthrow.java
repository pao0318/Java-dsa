import java.util.*;

class Solution {
    public int[] solve(int n) {
        int[]arr2=new int[1];
        arr2[0]=1;
        if(n==0)
            return arr2;
        
        ArrayList<Integer> list=new ArrayList<>();
        int x=1;
        list.add(x);
        for(int i=1;i<n;i++){
            int curr=(x*(n-i+1))/i;
            list.add(curr);
            x=curr;
            
        }
        list.add(1);
        int []arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
        

    }
}
