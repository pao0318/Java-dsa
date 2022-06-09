import java.util.*;

class Pair{
    int v;
    int weight;
    Pair(int v, int weight){
        this.v=v;
        this.weight=weight;
    }
}


public class Main
{
    
    static void printGraph(ArrayList<ArrayList<Pair>> adj, int n){
        int[] wt=new int[n];
        boolean[] mst= new boolean[n];
        int [] parent= new int[n];
        
        for(int i=0;i<n;i++){
            wt[i]=Integer.MAX_VALUE;
            mst[i]=false;
            parent[i]=-1;
        }
        
        wt[0]=0;
        
        
        for(int i=0;i<n-1;i++){
            int min=Integer.MAX_VALUE, u=0;
            
            for(int j=0;j<n;j++){
                if(wt[j]<min && mst[j]==false){
                    min=wt[j];
                    u=j;
                }
            }
            mst[u]=true;
            
            for(Pair p: adj.get(i)){
                if(mst[p.v]==false && p.weight<wt[p.v]){
                    parent[p.v]=u;
                    wt[p.v]=p.weight;
                }
            }
            
        }
        for(int i=1;i<n;i++){
                System.out.println(parent[i]+" - "+ i);
            }
    }
    
    
	public static void main(String[] args) {
		int n=5;
		ArrayList<ArrayList<Pair>> adj= new ArrayList<>();
		for(int i=0;i<n;i++)
		    adj.add(new ArrayList<Pair>());
		
		adj.get(0).add(new Pair(1,2));
		adj.get(1).add(new Pair(0,2));
		
		adj.get(0).add(new Pair(3,6));
		adj.get(3).add(new Pair(0,6));
		
		adj.get(3).add(new Pair(1,8));
		adj.get(1).add(new Pair(3,8));
		
		
		adj.get(1).add(new Pair(2,3));
		adj.get(2).add(new Pair(1,3));
		
		adj.get(1).add(new Pair(4,5));
		adj.get(4).add(new Pair(1,5));
		
		adj.get(2).add(new Pair(4,7));
		adj.get(4).add(new Pair(2,7));
		
		Main obj= new Main();
		
		obj.printGraph(adj,n);
		
	}
}
