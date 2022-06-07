import java.util.*;

public class Main{
    static ArrayList<ArrayList<Integer>> graph= new ArrayList<>();
    static int[]indegree= new int[11];
    static Queue<Integer> pq= new LinkedList<>();
    static int[]res=new int[10001];


    public static  void addEdge(int u, int v){
        graph.get(u).add(v);
        indegree[v]++;
        
    }

    public static void printOrder(int n, int m){
        for(int i=1;i<=n;i++){
            if(indegree[i]==0){
                pq.add(i);
               indegree[i]=1;
            }
        }
        
        
        while(!pq.isEmpty()){
            Integer temp=pq.poll();
            
            for(Integer t:graph.get(temp)){
                indegree[t]--;
                
                if(indegree[t]==0){
                    pq.add(t);
                    indegree[t]=indegree[temp]+1;
                }
            }
        }
        
        for(int i=0;i<indegree.length;i++){
            System.out.println(indegree[i]);
        }
    }
    
	public static void main(String[] args) {
	    

		
		int n=10;
		int m=13;
	
		for(int i=0;i<n+1;i++)
		    graph.add(new ArrayList<>());
		    
		addEdge(1, 3);
        addEdge(1, 4);
        addEdge(1, 5);
        addEdge(2, 3);
        addEdge(2, 8);
        addEdge(2, 9);
        addEdge(3, 6);
        addEdge(4, 6);
        addEdge(4, 8);
        addEdge(5, 8);
        addEdge(6, 7);
        addEdge(7, 8);
        addEdge(8, 10);
        
        
        printOrder(n,m);
  
		
	}
}
