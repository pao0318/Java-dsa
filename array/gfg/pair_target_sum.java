// https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1?page=1&curated[]=1&sortBy=submissions
class Solution {
    
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        Arrays.sort(B);
        TreeMap<Long,Long> map= new TreeMap<>();
        for(int i=0;i<N;i++){
            if(bs(B,X-A[i]))
                map.put(A[i],X-A[i]);
        }
        
        pair[]res= new pair[map.size()];
        int idx=0;
        for(Map.Entry<Long,Long>x:map.entrySet())
            res[idx++]=new pair(x.getKey(),x.getValue());
        
        return res;
    }
    
    public boolean bs(long[]B, long target){
        int start=0;
        int end=B.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(B[mid]==target)
                return true;
            else if(B[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return false;
    }
}
