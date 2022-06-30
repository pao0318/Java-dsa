// https://www.youtube.com/watch?v=V8qIqJxCioo&list=PLgUwDviBIf0rGEWe64KWas0Nryn7SCRWw&index=28
import java.util.*;
public class Kosaraju {
    public static void dfs(int node, Stack<Integer>stack,ArrayList<ArrayList<Integer>> adj,int[]vis){
        vis[node]=1;
        for(Integer it:adj.get(node)){
            if(vis[it]==0)
                dfs(it,stack,adj,vis);
        }
        stack.push(node);
    }

    public static void revdfs(int node, ArrayList<ArrayList<Integer>>transpose, int[]vis){
        vis[node]=1;
        System.out.print(node+" ");
        for(Integer it:transpose.get(node)){
            if(vis[it]==0)
                revdfs(it,transpose,vis);
        }
    }


    public static void kosaraju(ArrayList<ArrayList<Integer>> adj, int n){

        int[]vis=new int[n];
        Stack<Integer>stack= new Stack<>();

        for(int i=0;i<n;i++){
            if(vis[i]==0)
                dfs(i,stack,adj,vis);
        }

        ArrayList<ArrayList<Integer>> transpose= new ArrayList<>();
        for(int i=0;i<n;i++)
            transpose.add(new ArrayList<>());

        for(int i=0;i<n;i++){
            vis[i]=0;
            for(Integer it:adj.get(i))
                transpose.get(it).add(i);
        }

        while(!stack.isEmpty()){
            int node=stack.pop();
            if(vis[node]==0){
                System.out.print("SSC: ");
                revdfs(node,transpose,vis);
                System.out.println();
            }
        }

    }


    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        int n=5;
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(1).add(3);
        adj.get(3).add(4);

        kosaraju(adj,n);

    }
}
