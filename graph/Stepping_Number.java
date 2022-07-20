// https://www.interviewbit.com/problems/stepping-numbers/

public class Solution {
   Set<Integer> res= new HashSet<>();
    public void dfs(int n, int A, int B){
        if(n>B)
            return;
        if(n>=A && n<=B)
           res.add(n);
           
        int r=n%10;
        
        if(r<9)
            dfs(n*10+(r+1), A, B);
        if(r>0)
            dfs(n*10 + (r-1), A, B);
    }  
    
    public int[] stepnum(int A, int B) {
       for(int i=0;i<=9;i++)
           dfs(i,A,B);
       
       int[]ans= new int[res.size()];
       int index=0;
       
       TreeSet<Integer> myTreeSet = new TreeSet(res);
       for(Integer it:myTreeSet)
        ans[index++]=it;
        
        return ans;
       
        
    }
}
