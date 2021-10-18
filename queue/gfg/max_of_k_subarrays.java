// https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1#
// YEH BETTER H
class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // creating the max heap ,to get max element always
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            Collections.reverseOrder());

        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        
        for(;i<k;i++){
            pq.add(arr[i]);
        }
        res.add(pq.peek());
        
        pq.remove(arr[0]);
        
        for(; i<n;i++){
            pq.add(arr[i]);
            res.add(pq.peek());
            pq.remove(arr[i-k+1]);
        }
        return res;
    }
}




// YE DEQUE
class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        if(n==0)
            return null;
        ArrayDeque<Integer> pq=new ArrayDeque<>();
        ArrayList<Integer> res=new ArrayList<>();    
        
       int i=0;
       int j=0;
        while(j<n){
             while(pq.size()>0 && pq.getLast()<arr[j])
                pq.removeLast();
            
            pq.offerLast(arr[j]);
            if(j-i+1==k){
                res.add(pq.peekFirst());
                if(pq.peekFirst()==arr[i])
                    pq.removeFirst();
                
            j++;
            i++;
            }
          
            else{
                j++;
            }
            
        }
        return res;
        
    }
}
