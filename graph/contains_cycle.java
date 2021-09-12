import java.util.*;
class Main{
    private int v;
    private List<List<Integer>>list;
    public Main(int v){
        this.v=v;
        list=new ArrayList<>(v);
        for(int i=0;i<v;i++)
            list.add(new LinkedList<>());
    }
    
    private void addEdge(int source,int dest){
        list.get(source).add(dest);
    }
    
    private boolean isCyclic(int idx, boolean[]visited,boolean[]cyclic){
        
        if(cyclic[idx])
            return true;
        if(visited[idx])
            return false;
        
        visited[idx]=true;
        cyclic[idx]=true;
        List<Integer>child=list.get(idx);
        for(Integer c:child)
            if(isCyclic(c,visited,cyclic))
                return true;
                
        cyclic[idx]=false;
        return false;
    }
    
    
    private boolean isCyclic(){
        boolean []visited=new boolean[v];
        boolean []cyclic=new boolean[v];
        
        for(int i=0;i<v;i++)
            if(isCyclic(i,visited,cyclic))
                return true;
        return false;    
        
    }
    
    
    public static void main(String args[]){
        Main g=new Main(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        
        if(g.isCyclic())
            System.out.println("Graph is cyclic");
        else    
            System.out.println("Graph doesnot contain cycle");
        
    }
    
}
