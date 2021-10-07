// https://practice.geeksforgeeks.org/problems/ffd66b6a0bf7cefb9987fa455974b6ea5695709e/1/#
class Solution
{
    static int find_height(int tree[], int n, int k)
    {
        Arrays.sort(tree);
        int ans=-1;
        int start=0;
        int end=tree[n-1];
        while(start<=end){
            int mid=(start+end)/2;
            int tot=0;
            for(int i=0;i<n;i++){
                if(tree[i]>mid)
                    tot+=tree[i]-mid;
            }
                if(tot==k)
                    return mid;
                else if(tot>k)
                    start=mid+1;
                else
                    end=mid-1;
                    
            }
            return ans;
        
        
    }
}
