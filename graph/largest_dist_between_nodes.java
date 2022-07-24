// https://www.interviewbit.com/problems/largest-distance-between-nodes-of-a-tree/
public class Solution {
    int ans=0;
    public int solve(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>>adj= new ArrayList<>();
        
        int n=A.size();
        if(n==1)
            return 0;
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        
        int root=0;
        for(int i=0;i<n;i++){
            if(A.get(i)==-1){
                root=i;
                continue;
            }
            adj.get(A.get(i)).add(i);
        }
        ans=0;
        int[]dist= new int[n];
        Arrays.fill(dist,-1);
        
        find(adj,dist,root);
        return ans-1;
        
    }
    public int find(ArrayList<ArrayList<Integer>>adj, int[]dist, int root){
        
        if(dist[root]!=-1)
            return dist[root];
        
        int max1=0;
        int max2=0;
        
        for(int i:adj.get(root)){
            int height=find(adj,dist,i);
            if(height>=max1){
                max2=max1;
                max1=height;
            }
            else if(height>max2){
                max2=height;
            }
            
        }
        ans=Math.max(ans,max1+max2+1);
        dist[root]=max1+1;
        return max1+1;
    }
}
