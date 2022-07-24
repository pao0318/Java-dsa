// https://www.interviewbit.com/problems/good-graph/ 
public class Solution {
    
    public int solve(ArrayList<Integer> A) {
        int n=A.size();
        int []vis= new int[n];
        Arrays.fill(vis,0);
      int ans=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                if(dfs(i,A,vis)==1)
                    ans++;
            }
        }
        return ans;
    }
    
    public int dfs(int node, ArrayList<Integer> A, int[]vis){
        if(A.get(node)==1)
            return 0;
            
        if(vis[node]==1){
            A.set(node,1);
            return 1;
        }
        
        vis[node]=1;
        int t=dfs(A.get(node)-1,A,vis);
        A.set(node,1);
        return t;
    }
}
