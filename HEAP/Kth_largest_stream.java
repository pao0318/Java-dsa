import java.util.*;

class KthLargestStream {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    int k;
    public KthLargestStream(int[] nums, int k) {
        this.k=k;
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
            if(pq.size()>k+1)
                pq.poll();
        }         

    }

    public int add(int val) {
        pq.add(val);
        if(pq.size()>k+1)
            pq.poll();
        return pq.peek();    
        
    }
}
