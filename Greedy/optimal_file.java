import java.util.*;
public class Main{
    static int minComp(int size, int arr[]){
        //Creating minheap
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<size;i++)
            pq.add(arr[i]);
        int count=0;
        while(pq.size()>1){
            // pop two smallest size element
            // from the min heap
            int temp=pq.poll()+pq.poll();
            count+=temp;
            // add new combined file size
            // to priority queue or min heap
            pq.add(temp);
        }
        return count;
    }
    public static void main(String args[]) throws Exception{
        int size=6;
        int arr[]=new int[]{2,3,4,5,6,7};
        
        System.out.println(minComp(size,arr));
    }
}
