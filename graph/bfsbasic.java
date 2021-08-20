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
