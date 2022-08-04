// https://binarysearch.com/room/Is-Is-7sdOdcpfZ7?questionsetIndex=1
import java.util.*;

class Solution {
    public int[] solve(int[][] tasks) {
        int []res= new int[tasks.length];
        PriorityQueue<int[]>pq= new PriorityQueue<>((a,b)->a[1]-b[1]);
        PriorityQueue<int[]>heap= new PriorityQueue<>((a,b)->(a[2]==b[2]? a[0]-b[0]:a[2]-b[2]));

        for(int[] task : tasks) 
            pq.offer(task);

        int start = pq.peek()[1];
        int index = 0;

        while(!pq.isEmpty() || !heap.isEmpty()){
            if(heap.isEmpty()){
                start=Math.max(start, pq.peek()[1]);
                heap.offer(pq.poll());
            }

            while(!pq.isEmpty() && pq.peek()[1]<=start)
                heap.offer(pq.poll());
            
            int[]curr=heap.poll();
            res[index++]=curr[0];
            start+=curr[2];
        }
    return res;

    }
}
