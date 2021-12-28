// https://www.geeksforgeeks.org/graph-and-its-representations/
import java.util.*;
class Main{
    
    static void addEdge(ArrayList<ArrayList<Integer>>graph, int u, int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    
    static void printGraph(ArrayList<ArrayList<Integer>>graph){
        
        for(int i=0;i<graph.size();i++){
            System.out.println("List of "+i);
            System.out.print("Head ->");
            for(int j=0;j<graph.get(i).size();j++){
                System.out.print(graph.get(i).get(j)+"->");
            }
            System.out.println(" ");
        }
    }
    
    public static void main(String args[]) throws Exception{
        int V=5;
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>(V);
        
        for(int i=0;i<V;i++)
            graph.add(new ArrayList<Integer>());
            
        addEdge(graph,0,1);
        addEdge(graph,0,4);
        addEdge(graph,1,4);
        addEdge(graph,1,2);
        addEdge(graph,1,3);
        addEdge(graph,2,3);
        addEdge(graph,3,4);
        
        printGraph(graph);
    }
}
