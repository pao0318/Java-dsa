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

import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr){
         this.src = src;
         this.nbr = nbr;
        
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int vtcs=sc.nextInt();
        ArrayList<Edge> []list=new ArrayList[vtcs];
        for(int i=0;i<vtcs;i++)
            list[i]=new ArrayList<>();
            
         int edges=sc.nextInt();
         
         for(int i=0;i<edges;i++){
             int n1=sc.nextInt();
             int n2=sc.nextInt();
             list[n1].add(new Edge(n1,n2));
            //  list[n2].add(new Edge(n2,n1));
         }
         int src=sc.nextInt();
           bfs(src,vtcs,list);
            
    }
    static void bfs(int src, int vtcs,ArrayList<Edge> []list){
        boolean []visited=new boolean[vtcs];
        Queue<Integer> pq=new LinkedList<>();
        visited[src]=true;
        pq.add(src);
        while(!pq.isEmpty()){
            src=pq.poll();
            System.out.print(src+" ");
            

            while(list[src].nbr!=0){
                int jai=list[src].nbr();
                if(!visited[jai]){
                    visited[jai]=true;
                    pq.add(jai);
                }
            }
        }
    } 
}
    
   
