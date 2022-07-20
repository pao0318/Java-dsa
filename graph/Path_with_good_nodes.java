// https://www.interviewbit.com/problems/path-with-good-nodes/
ublic class Solution {
     int cntr=0;
     int k=0;
    public int solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B, int C) {
        List<List<Integer>>adj= new ArrayList<>();
        int size=A.size();
        for(int i=0;i<size+1;i++)
            adj.add(new ArrayList<>());
        
        for(int i=0;i<B.size();i++){
            adj.get(B.get(i).get(0)).add(B.get(i).get(1));
            adj.get(B.get(i).get(1)).add(B.get(i).get(0));
        }
         
           return dfs(1,0,adj,A,C,0);
    }
    
    public int dfs(int root, int parent,List<List<Integer>>adj,ArrayList<Integer> A,int C, int cnt){
        int ans=0;
        cnt+=A.get(root-1);
        if(adj.get(root).size()==1){
            return cnt<=C?1:0;
        }
        
        for(Integer node:adj.get(root)){
            if(node!=parent){
                ans+=dfs(node,root,adj,A,C,cnt);
            }
        }
        return ans;
      
    }
