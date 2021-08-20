import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt){
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
 public static void main(String args[]) throws Exception{
     Scanner sc=new Scanner(System.in);
     int vtcs=sc.nextInt();
     ArrayList<Edge>[]graph=new ArrayList[vtcs];
     for(int i=0;i<vtcs;i++)
        graph[i]=new ArrayList<>();
        
    int edges=sc.nextInt();
    for(int i=0;i<edges;i++){
        String[]parts =sc.nextLine().split(" ");
        int v1=Integer.parseInt(parts[0]);
        int v2=Integer.parseInt(parts[1]);
        int wt=Integer.parseInt(parts[2]);
        graph[v1].add(new Edge(v1,v2,wt));
        graph[v2].add(new Edge(v2,v1,wt));
    }
    int src=sc.nextInt();
    int dest=sc.nextInt();
    
    boolean []visited=new boolean[vtcs];
    boolean path=hasPath(graph,src,dest,visited);
    System.out.println(path);
    
 }
 public static boolean hasPath(ArrayList<Edge>[]graph, int src, int dest, boolean[] visited){
    if(src==dest)
        return true;
        
    visited[src]=true;
    for(Edge edge:graph[src]){
        if(visited[edge.nbr]==false){
            boolean hasNbrPath=hasPath(graph, edge.nbr,dest,visited);
            if(hasNbrPath)
                return true;
        }      
    }
    return false;
 }
  
 
}
// Upar wala kaam nhi kar rha

import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      int src = Integer.parseInt(br.readLine());
      int dest = Integer.parseInt(br.readLine());

      boolean[] visited = new boolean[vtces];
      boolean flag = hasPath(graph, src, dest, visited);
      System.out.println(flag);
   }

   public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited) {
      if (src == dest) {
         return true;
      }

      visited[src] = true;
      for (Edge e : graph[src]) {
         if (!visited[e.nbr]) {
            boolean nbrHasPath = hasPath(graph, e.nbr, dest, visited);
            if (nbrHasPath) {
               return true;
            }
         }
      }

      return false;
   }

}


                        


                        
