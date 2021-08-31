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
