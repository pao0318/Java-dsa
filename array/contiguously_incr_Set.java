import java.util.*;

class Solution {
    public int[] solve(int start, int end) {
        List<Integer> set=new ArrayList();
            for(int i=1;i<=9;i++){
                if(i>=start && i<=end) set.add(i);

                int j=i+1;
                int x=i*10+j;
                while(j<=9){
                    if(x<=end && x>=start)
                        set.add(x);
                    x=x*10+(++j);    
                }
                
        }
        Collections.sort(set);
        int[] arr=new int[set.size()];
        for(int i=0;i<set.size();i++)
            arr[i]=set.get(i);
        
       return arr;



    }
}
