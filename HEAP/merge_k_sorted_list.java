// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd
import java.util.*;

class Solution {
    public int[] solve(int[][] lists) {
        Queue<int[]> dq = new ArrayDeque<>();
        for (int i = 0; i < lists.length; i++) 
            dq.offer(lists[i]);
        
        while(dq.size()>1){
            int[]arr1=dq.poll();
            int[]arr2=dq.poll();
            int i=0;
            int j=0;
            int temp[]=new int[arr1.length+arr2.length];
            int k=0;
            while(i<arr1.length && j<arr2.length){
                if(arr1[i]>arr2[j])
                    temp[k++]=arr2[j++];
                else
                    temp[k++]=arr1[i++];
            }
            while (i<arr1.length)
                temp[k++] = arr1[i++];
            while (j<arr2.length)
                temp[k++] = arr2[j++];    
            
                dq.offer(temp);        
            }
        
        return dq.poll();
    }
}
