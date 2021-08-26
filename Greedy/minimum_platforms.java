// https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1#
class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        int times[][]=new int[n][2];
        for(int i=0;i<n;i++){
            times[i][0]=arr[i];
            times[i][1]=dep[i];
        }
       Arrays.sort(times, (a,b)-> Integer.compare(a[0],b[0]));
       PriorityQueue<Integer> pq=new PriorityQueue<>();
    //   int mzxPlatform=0;
       for(int i=0;i<n;i++){
           if(pq.size()>0 && pq.peek()<times[i][0]){
               pq.remove();
               pq.add(times[i][1]);
           }
           else
                pq.add(times[i][1]);
           
       }
       return pq.size();
        
    }
    
}

// AUR EK APPROACH
class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
       Arrays.sort(arr);
       Arrays.sort(dep);
       int nStations=1;
       int j=0;
       for(int i=1;i<n;i++){
           if(arr[i]>dep[j])
                j++;
            else
                ++nStations;
           
       }
       return nStations;
       
    }
    
}
