class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[]=new boolean[V];
        boolean ret=true;
        for(int i=0;i<V;i++)
            ret=ret&&dfs(adj,-1,i,visited);
        return !ret;    
        
    }
    boolean dfs(ArrayList<ArrayList<Integer>> adj, int parent,int src,boolean[]visited){
        if(visited[src])
            return true;
        
        visited[src]=true;
        boolean ret=true;
        for(Integer x:adj.get(src)){
            if(x!=parent){
                if(!visited[x])
                ret=ret&&dfs(adj,src,x,visited);
            else{
                ret=false;
                break;
            }
            }
        }
        return ret;
    }
   
}
