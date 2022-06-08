import java.util.*;

class Pair implements Comparable<Pair>{
    int v;
    int weight;
    Pair(int v, int weight){
        this.v=v;
        this.weight=weight;
    }
    public int compareTo(Pair o){
        return weight-o.weight;
    }
    
}
class Main{
    
    static void addEdge(ArrayList<ArrayList<Pair>> graph, int u, int v, int weight){
        graph.get(u).add(new Pair(v,weight));
        graph.get(v).add(new Pair(u,weight));
    }
    
    
    void shortestPath(ArrayList<ArrayList<Pair>> graph, int source, int n){
        int[]dist= new int[n];
        PriorityQueue<Pair> pq= new PriorityQueue<>();
        
        for(int i=0;i<n;i++)
            dist[i]=Integer.MAX_VALUE;
        
        dist[source]=0;
        pq.add(new Pair(source,0));
        
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            
            for(Pair nbr:graph.get(p.v)){
                if(dist[nbr.v]>dist[p.v]+nbr.weight){
                    dist[nbr.v]=dist[p.v]+nbr.weight;
                    pq.add(new Pair(nbr.v,dist[nbr.v]));
                }
            }
        }
        
        for(int i=0;i<n;i++)
            System.out.println(dist[i]+" ");
        
   
    }
    
    
    
    public static void main(String args[]){
        Main obj= new Main();
        
        ArrayList<ArrayList<Pair>> graph= new ArrayList<>();
        int  n=6;
        int source=1;
        for(int i=0;i<n;i++)
            graph.add(new ArrayList<Pair>());
            
        addEdge(graph,1,2,2);
        addEdge(graph,2,5,5);
        addEdge(graph,1,4,1);
        addEdge(graph,4,3,3);
        addEdge(graph,3,5,1);
        addEdge(graph,3,2,4);
 
        obj.shortestPath(graph,source,n);

    }
    
    
}
