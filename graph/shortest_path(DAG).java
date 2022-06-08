// DAG - Directed Acyclic Graph


import java.util.*;

class Pair{
    int v;
    int weight;
    Pair(int v, int weight){
        this.v=v;
        this.weight=weight;
    }
    
}

public class Main {
    
    // topo order
    
    public void findtopo(int node, ArrayList<ArrayList<Pair>> graph, boolean[]vis, Stack<Integer> stack){
        vis[node]=true;
        for(Pair it: graph.get(node)){
            if(!vis[it.v])
                findtopo(it.v,graph, vis,stack);
        }
        
        stack.add(node);
    }
    
    
    
    // shortestPath
    void shortestPath(int source, ArrayList<ArrayList<Pair>> graph, int n){
        boolean[]vis= new boolean[n];
        Stack<Integer> stack= new Stack<>();
        
        int[]dist= new int[n];
        for(int i=0;i<n;i++){
            vis[i]=false;
            dist[i]=Integer.MAX_VALUE;
        }
        
        
        for(int i=0;i<n;i++){
            if(!vis[i])
                findtopo(i,graph,vis,stack);
            
        }
        dist[source]=0;
        
        while(!stack.isEmpty()){
            Integer curr=stack.pop();
            
            if(dist[curr]!=Integer.MAX_VALUE){
                for(Pair p: graph.get(curr)){
                    if(dist[p.v]>dist[curr]+p.weight)
                        dist[p.v]=dist[curr]+p.weight;
                }
            }
            
        }
        
        for(int i=0;i<n;i++){
            if(dist[i]==Integer.MAX_VALUE)
                System.out.println("INF");
            else
                System.out.println(dist[i]+" ");
        }
        
            
    }
    

	public static void main(String[] args) {
	    Main obj= new Main();
	
	ArrayList<ArrayList<Pair>> graph= new ArrayList<>();
	int n=6;
	int source=0;
	for(int i=0;i<n;i++)
	    graph.add(new ArrayList<Pair>());
	
	graph.get(0).add(new Pair(1,2));
	graph.get(0).add(new Pair(4,1));
	graph.get(1).add(new Pair(2,3));
	graph.get(2).add(new Pair(3,6));
	graph.get(4).add(new Pair(2,2));
	graph.get(4).add(new Pair(5,4));
	graph.get(5).add(new Pair(3,1));
	
	obj.shortestPath(source,graph,n);
	
	

	}
	

	
	
}
