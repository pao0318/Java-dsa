class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) {
        
    int[]color= new int[n];
    
    
    return colorable(graph,color,m,n,0);
    
    }
    
    public boolean colorable(boolean[][]graph, int[]color, int m, int n, int node){
        if(node==n)
            return true;
            
        for(int i=1;i<=m;i++){
            if(isSafe(node,graph,color,i)){
                color[node]=i;
                if(colorable(graph,color,m,n,node+1))
                    return true;
                color[node]=0;
                
            }
        }
        return false;
    }
    
    public boolean isSafe(int node, boolean[][]graph, int []color,int col){
        for(int j=0;j<graph.length;j++){
            if(graph[node][j]){
                if(color[j]==col)
                    return false;
            }
        }
        return true;
    }
 
}
