// https://www.interviewbit.com/problems/chain-of-pairs/https://www.interviewbit.com/problems/chain-of-pairs/
public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int n=A.size();
        int max=-1;
        int []mcl=new int[n];
        for (int i = 0; i < n; i++ )
          mcl[i] = 1;
          
        for(int i=1;i<n;i++){
            
            for(int j=0;j<i;j++){
                if(A.get(i).get(0)>A.get(j).get(1) && mcl[i]<mcl[j]+1)
                mcl[i]=mcl[j]+1;
                
            }
        }
        
        for(int i=0;i<n;i++)
            max=Math.max(max,mcl[i]);
            
        return max;
        
    }
}
