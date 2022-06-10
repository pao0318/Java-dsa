class Solution {
    public long maximumImportance(int n, int[][] roads) {
        Map<Integer,Integer> map= new HashMap<>();
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        
        Queue<Integer> pq= new LinkedList<>();
        boolean []vis= new boolean[n];
        int[]indegree= new int[n];
        
        for(int []arr:roads){
            int src=arr[0];
            int nbr=arr[1];
            adj.get(src).add(nbr);
            indegree[nbr]++;
            adj.get(nbr).add(src);
            indegree[src]++;
        }
        
        Arrays.sort(indegree);
        
        long res=0;
        int k=n;
        for(int i=n-1;i>=0;i--){
            res+=(long)k*(indegree[i]);
            k--;
        }
      return res;
        
    }
}
