import java.util.*;
class Main{
    private int V;
    private LinkedList<Integer> adj[];
    
    Main(int v){
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;++i)
            adj[i]=new LinkedList();
    }
    
    void addEdge(int u, int v){
        adj[u].add(v);
    }
    
    
    void dfshelper(int v, boolean visited[]){
        visited[v] = true;
        System.out.print(v + " ");
        
        Iterator<Integer> itr=adj[v].listIterator();
            while(itr.hasNext()){
                int num=itr.next();
                if(!visited[num])
                    dfshelper(num,visited);
            }
    }
    void DFS(int v){
        boolean []visited=new boolean[V];
         dfshelper(v,visited);
        }
    
    

    
    // main function starts
    public static void main(String args[]) throws Exception{
        Main g=new Main(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        System.out.println(
            "Following is Depth First Traversal");
  
        g.DFS(0);
    }
 
    
}
// NEECHE WALA NHI HO RHA
import java.util.*;
public class Main{
    static int V=4;
    static ArrayList<LinkedList<Integer>> adj=new ArrayList<LinkedList<Integer>>(V);
    static void addEdge(int u, int v){
        adj.get(u).add(v);
    }
    
    static void dfsutil(int v,boolean visited[]){
        // Mark the current node as visited and print it
        visited[v]=true;
        System.out.println(v+" ");
        // Recur for all the vertices adjacent to this
        // vertex
        Iterator<Integer> i=adj.get(v).listIterator();
        while(i.hasNext()){
            int n=i.next();
            if(!visited[n])
                dfsutil(n,visited);
        }
    }
    
    
    static void dfs(int v){
        boolean [] visited=new boolean[v];
        dfsutil(v,visited);
    }
    
    
    // main function
    public static void main(String args[]) throws Exception{
        
        for(int i=0;i<V;i++){
            adj.add(new LinkedList<Integer>());
        }
        
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 2);
        addEdge(2, 0);
        addEdge(2, 3);
        addEdge(3, 3);
        
        System.out.println(
            "Following is Depth First Traversal "
            + "(starting from vertex 2)");
        dfs(2);  
    }
}
