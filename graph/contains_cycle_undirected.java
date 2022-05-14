class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean []vis= new boolean[V];
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                if (checkCycle(i,-1,vis,adj))
                    return true;
            }
        }
       return false;
    }
    
    public boolean checkCycle(int node, int parent,boolean[]vis,ArrayList<ArrayList<Integer>> adj ){
        
        if(vis[node])
            return true;
        
        vis[node]=true;
        
        for(Integer x:adj.get(node)){
            if(vis[x]==false){
                if (checkCycle(x, node ,vis,adj)==true)
                    return true;
            }
            else if(x!=parent)
                return true;
        }
        return false;
        
    }
}
