// https://www.geeksforgeeks.org/graph-and-its-representations/
import java.util.*;
public class Main{
    static void addEdge(ArrayList<ArrayList<Integer>>adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
        
    }
    public static void main(String args[]) throws Exception{
        // for 5 vertices
        int V=5;
        ArrayList<ArrayList<Integer>> graph=new ArrayList<ArrayList<Integer>>(V);
        for(int i=0;i<V;i++)
            graph.add(new ArrayList<Integer>());
            
            addEdge(graph,0,1);
            addEdge(graph,0,4);
            addEdge(graph,1,2);
            addEdge(graph,1,3);
            addEdge(graph,1,4);
            addEdge(graph,2,3);
            addEdge(graph,3,4);
            
            printGraph(graph);
        
    }
    static void printGraph(ArrayList<ArrayList<Integer>>adj){
        for(int i=0;i<adj.size();i++){
            System.out.println("Adjacency list of vertex"+i);
            System.out.print("head");
            for(int j=0;j<adj.get(i).size();j++)
                System.out.print("->"+adj.get(i).get(j));
            System.out.println();
        }
        
    }
}
