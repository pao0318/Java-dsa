// https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1#
class Solution
{
    //Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj)
    {
        boolean[]visited=new boolean[V];
        ArrayList<Integer> list=new ArrayList<>();
        Queue<Integer> pq=new LinkedList<Integer>();
        visited[0]=true;
        pq.add(0);
        while(!pq.isEmpty()){
            int temp=pq.poll();
            list.add(temp);
            for(int i:adj.get(temp)){
                if(!visited[i]){
                    visited[i]=true;
                    pq.add(i);
                }
            }
        }
        return list;
    }
}
// scratch
import java.util.*;
class Main{
    int v;
    LinkedList<Integer> adj[];
    
    Main(int v){
        v=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
            adj[i]=new LinkedList();
    }
    void addEdge(int v,int w){
        adj[v].add(w);
    }
    void bfs(int s){
        boolean visited[]=new boolean[v];
        LinkedList<Integer> queue=new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);
        while(queue.size()>0){
            s=queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> itr=adj[s].listIterator();
            while(itr.hasNext()){
                int num=itr.next();
                if(!visited[num]){
                    visited[num]=true;
                    queue.add(num);
                }
            }
        }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of vertices");
        int vtcs=sc.nextInt();
        Main g=new Main(vtcs);
        
        System.out.println("Enter Number of edges");
        int edges=sc.nextInt();
    
        int source,destination;
        System.out.println("Enter Source <space> Destination (0-indexing)");
        for(int j=0;j<edges;j++){
            source=sc.nextInt();
            destination=sc.nextInt();
              if(source >= vtcs || destination >= vtcs){
                System.out.println("Invalid Edge");
                j--;
            }
            
            g.addEdge(source, destination);
        }
        System.out.println("Enter starting vertex");
        int start = sc.nextInt();
        
        System.out.println("Following is Breadth First Traversal, starting from vertex " + start); 
  
        g.bfs(start); 
        
    }       
}
