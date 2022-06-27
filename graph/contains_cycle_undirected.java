// Best method by union and path compression for finding parents

import java.util.*;
public class Disjoint_set{
    public static void main(String []args){
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        int n=3;
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(2).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);

        int[]parent= new int[n];
        Arrays.fill(parent,-1);


        for(int i=0;i<n;i++){
            int src=adj.get(i).get(0);
            int dest=adj.get(i).get(1);

            int x=findPar(parent,src);
            int y=findPar(parent,dest);
            if(x==y){
                System.out.println("Graph contains cycle");
                break;
            }
            parent[x]=y;
        }

    }

    public static int findPar(int[]parent, int i){
        if(parent[i]==-1)
            return i;
        return findPar(parent, parent[i]);

    }


}


















// OR






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
