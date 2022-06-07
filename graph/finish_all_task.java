import java.util.*;
public class Main{

    static int n=4;
    static ArrayList<ArrayList<Integer>> graph= new ArrayList<>();
    static int[]indegree= new int[n];

    public static void main(String[]args){
        for(int i=0;i<n;i++)
            graph.add(new ArrayList<>());
            
        addEdge(1,0);
        addEdge(2,1);
        addEdge(3,2);
        
        if(canFinish(n))
            System.out.println("All tasks can be done");
        else    
            System.out.println("Some tasks left");
        
    }
    
    public static void addEdge(int u, int v){
        graph.get(v).add(u);
        indegree[u]++;
        
    }
    
    public static boolean canFinish(int n){

        Queue<Integer> pq= new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0)
                pq.add(i);
        }

        while(!pq.isEmpty()){
            Integer temp= pq.poll();
            
            for(int t:graph.get(temp)){
                indegree[t]--;
                
                if(indegree[t]==0){
                    pq.add(t);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(indegree[i]!=0)
                return false;
        }
        return true;
        
    }
   
}
