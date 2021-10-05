// https://practice.geeksforgeeks.org/problems/large-factorial4721/1/#
class Solution {
    public long[] factorial(long a[], int n) {
        long max=a[0];
      
        for(int i=1;i<n;i++)
            max=Math.max(max,a[i]);
        ArrayList<Long> list=new ArrayList<>();
        list.add(new Long(1));
        list.add(new Long(1));
        
        for(int i=2;i<=max;i++)
            list.add((i*list.get(i-1))%1000000007);
            
        long res[] = new long[n];
        for(int i = 0; i < n; i++)
            res[i] = list.get((int)a[i]);
    
        
        return res;
        
    }
}
