import java.util.*;

public class Main
{
    
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int x, int y){
        adj.get(x).add(y);
        adj.get(y).add(x);
    }
    
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
		int n=8;
		for(int i=0;i<n;i++)
		    adj.add(new ArrayList<>());
		
		addEdge(adj, 0, 1);
        addEdge(adj, 0, 3);
        addEdge(adj, 1, 2);
        addEdge(adj, 3, 4);
        addEdge(adj, 3, 7);
        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 4, 7);
        addEdge(adj, 5, 6);
        addEdge(adj, 6, 7);
        int source = 0, dest = 7;
        
        System.out.println(findshortest(adj,source,dest,n));
		
	}
	
	public static int findshortest(ArrayList<ArrayList<Integer>> adj,int source, int dest, int n){
	    int []distance= new int[n];
	    
	    for(int i=0;i<n;i++)
	        distance[i]=Integer.MAX_VALUE;
	    
	    Queue<Integer> pq= new LinkedList<>();
	    pq.add(source);
	    distance[source]=0;
	    
	    while(!pq.isEmpty()){
	        int parent=pq.poll();
	        
	        for(Integer temp: adj.get(parent)){
	            if(distance[temp]>1+distance[parent]){
	                distance[temp]=1+distance[parent];
	                pq.add(temp);
	            }
	                
	        }
	    }
	    
	    return distance[dest];
	}

	
}
