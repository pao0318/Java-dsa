// 
import java.util.*;
class Node{
    int u;
    int v;
    int weight;
    Node(int u, int v, int weight){
        this.u=u;
        this.v=v;
        this.weight=weight;

    }
}

public class Kruskals_algo {
    public static void main(String args[]){
        int n=5;
        ArrayList<Node> adj= new ArrayList<Node>();

        adj.add(new Node(0,1,2));
        adj.add(new Node(0,3,6));
        adj.add(new Node(1,3,8));
        adj.add(new Node(1,2,3));
        adj.add(new Node(1,4,5));
        adj.add(new Node(2,4,7));

        Kruskals_algo obj= new Kruskals_algo();
        obj.kruskal(adj,n);

    }


    int findPar(int []parents, int i){
        if(parents[i]==-1)
            return i;
        return findPar(parents,parents[i]);
    }
    void union(int u, int v, int[]parent,int[]rank){
        u=findPar(parent,u);
        v=findPar(parent,v);
        if(rank[u]<rank[v])
            parent[u]=v;
        else if(rank[u]>rank[v])
            parent[v]=u;
        else{
            parent[v]=u;
            rank[u]++;
        }


    }


    void kruskal(ArrayList<Node> adj, int n){
        Collections.sort(adj, new CustomComparator());
        int[]parent= new int[n];
        int []rank= new int[n];
        Arrays.fill(parent,-1);
        Arrays.fill(rank,0);

        int cost=0;
        ArrayList<Node> mst= new ArrayList<>();
        for(Node it:adj){
            if(findPar(parent,it.u)!=findPar(parent,it.v)){
                cost+=it.weight;
                mst.add(it);
                union(it.u,it.v,parent,rank);
            }

        }

        System.out.println(cost);
        for(Node it:mst)
            System.out.println(it.u+"->"+it.v);
    }


    class CustomComparator implements Comparator<Node>{
        public int compare(Node o1, Node o2){
            if(o1.weight<o2.weight)
                return -1;
            else if(o1.weight>o2.weight)
                return 1;
            return 0;
        }
    }
}
