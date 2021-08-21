
// https://practice.geeksforgeeks.org/problems/water-connection-problem5822/1#
class Solution 
{ 
    static int[] pipe_start;
    static int[] pipe_end;
    static int[] pipe_dist;
    static int ans;
    
    static int dfs(int j){
        
        if(pipe_start[j]==0) 
            return j;
        if(pipe_dist[j]<ans) 
            ans=pipe_dist[j];
        
        return dfs(pipe_start[j]);
    }
    
ArrayList<ArrayList<Integer>> solve(int n, int p, ArrayList<Integer> a ,ArrayList<Integer> b ,ArrayList<Integer> d) { 
        
        pipe_start=new int[1000];
        pipe_end=new int[1000];
        pipe_dist=new int[1000];
        
        for(int i=0;i<p;i++){
            
            int s=a.get(i);
            int e=b.get(i);
            pipe_start[s]=e;
            pipe_end[e]=s;
            pipe_dist[s]=d.get(i);
        }
        
        
       ArrayList<ArrayList<Integer>> graph=new ArrayList<ArrayList<Integer>>();
       for(int i=1;i<=n;i++){
           
           if(pipe_end[i]==0 && pipe_start[i]>0){
               int ans=1000000;
               int ending=dfs(i);
               ArrayList<Integer> list=new ArrayList<>();
               list.add(i);
               list.add(ending);
               list.add(ans);
               graph.add(list);
               
           }
       }
       return graph;
       
     }
} 
