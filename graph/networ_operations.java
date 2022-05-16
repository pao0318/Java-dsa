class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1)
            return -1;
        
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int []a:connections){
            graph.get(a[0]).add(a[1]);
            graph.get(a[1]).add(a[0]);
        }
        
        boolean []vis=new boolean[n];
        List<List<Integer>> rest= new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(!vis[i]){
                List<Integer> ans=new ArrayList<>();
                dfs(i,graph,vis,ans);
                rest.add(ans);
            }
        }
        
        
        return rest.size()-1;
        
    }
    
    public void dfs(int src, List<List<Integer>> graph, boolean[]vis,List<Integer> ans ){
        ans.add(src);
        vis[src]=true;
        
        for(int x: graph.get(src)){
            if(!vis[x]){
                dfs(x,graph,vis,ans);
            }
        }
    return; 
    }
}
