import java.util.*;


public class Main
{
    
    boolean dfs(int[]color, int i,ArrayList<ArrayList<Integer>> adj){
        
        Queue<Integer> pq= new LinkedList<>();
        
        
    }
    
    boolean checkBiparitite(ArrayList<ArrayList<Integer>> adj, int n){
        int []color= new int[n+1];
        
        for(int i=1;i<=n;i++)
            color[i]=-1;
        
        for(int i=1;i<=n;i++){
            if(color[i]==-1){
                if(!bfs(color,i,adj))
                    return false;
            }
            
        }
        return true;
        
    }
    
    
    
	public static void main(String[] args) {
	    
	    ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
	    int n=8;
	    for(int i=1;i<=n;i++)
	        adj.add(new ArrayList<>());
	   
	   adj.get(1).add(2);
	   adj.get(2).add(1);
	   
	   adj.get(2).add(3);
	   adj.get(2).add(7);
	   
	   adj.get(3).add(4);
	   adj.get(2).add(3);
	   adj.get(4).add(3);
	   
	   adj.get(4).add(5);
	   adj.get(7).add(2);
	   
	   adj.get(7).add(6);
	   adj.get(6).add(7);
	   
	   adj.get(6).add(5);
	   adj.get(5).add(6);
	   
	   adj.get(5).add(4);
	   adj.get(5).add(8);
	   
	   adj.get(8).add(5);
	   
	   
		Main obj = new Main();
		
		
		if(obj.checkBiparitite(adj,n))
		    System.out.println("Yes, its Biparitite");
		else
		    System.out.println("No, its not Bipartite");
	}
}
