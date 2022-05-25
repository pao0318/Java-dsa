import java.util.*;
class Main{
    class Edge{
        int src;
        int nbr;
        int wt;
        Edge(int src, int nbr, int wt){
            this.src=src;
            this.nbr=nbr;
            this.wt=wt;
        }
    }
    
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int vtcs= sc.nextInt();
        int edges=sc.nextInt();
        List<List<Edge>> graph= new ArrayList<>();
        
        for(int i=0;i<vtcs;i++)
            graph.add(new ArrayList<>());
            
        for(int i=0;i<edges;i++){
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            int wt=sc.nextInt();
            graph.get(v1).add(new Edge(v1,v2,wt));
            graph.get(v2).add(new Edge(v2,v1,wt));
        }
        
        int src=sc.nextInt();
        
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        pq.add(new Pair(src, src+"",0);
        boolen []visited= new boolean[vtcs];
        
        while(!pq.isEmpty()){
            Pair rem=pq.poll();
            if(visited[rem.v])
                continue;
            
            visited[rem.v]=true;
            System.out.println(rem.v+" via"+ rem.psf+ "@" + rem.wsf);
            
            for(Edge e: graph.get(rem.v)){
                if(visited[e.nbr]==false)
                    pq.add(new Pair(e.nbr, rem.psf+e.nbr,res.wsf+e.wt));
            }
        }
    }
    
    
    class Pair implements Comparable<Pair>{
        int v;
        int psf;
        int wsf;
        Pair(int v, int psf, int wsf){
            this.v=v;
            this.psf=psf;
            this.wsf=wsf;
        }
        
    }
    

    
}
