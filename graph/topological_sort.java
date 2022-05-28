class Solution
{
   
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        
        int[]res=new int[V];
        Stack<Integer> stack= new Stack<>();
        
        boolean visited[]= new boolean[V];
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(i,visited,adj,stack);
            }
            
        }
        int index=0;
        while(!stack.isEmpty()){
            res[index++]=stack.pop();
            
        }
        return res;
        
    }
    
    public static void dfs(int i, boolean[]visited,ArrayList<ArrayList<Integer>> adj,Stack<Integer> stack){
        visited[i]=true;
        
        for(Integer temp:adj.get(i)){
            if(!visited[temp]){
                dfs(temp,visited,adj,stack);
            }
        }
        stack.push(i);
        
    }
}
