// https://practice.geeksforgeeks.org/problems/print-adjacency-list-1587115620/1#
class Solution {
    // Function to return the adjacency list for each vertex.
    public ArrayList<ArrayList<Integer>> printGraph(
        int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        
        for(int i=0;i<adj.size();i++){
            
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(i);
            for(int j=0;j<adj.get(i).size();j++){
                temp.add((adj.get(i).get(j)));
            }
            res.add(temp);
        }
        return res;
    }
}
