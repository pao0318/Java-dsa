package heap;
import java.util.Collections;
import java.util.PriorityQueue;
public class HeapApp{
    public static void MinHeap(int arr[]){
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        
        for (int i=0;i<arr.length;i++){
            heap.add(arr[i]);
            System.out.print(heap.peek()+ " ");
        }
        System.out.println();
        
        for(int i=0;i<arr.length;i++){
            heap.poll();
            System.out.print(heap.peek()+ " ");
        }
        System.out.println();
        
    }
    
    public static void MaxHeap(int arr[]){
        PriorityQueue<Integer> heap=new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i=0;i<arr.length;i++){
            heap.add(arr[i]);
            System.out.print(heap.peek()+" ");
        }
        System.out.println();
        
        for(int i=0;i<arr.length;i++){
            heap.poll();
            System.out.print(heap.peek()+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[]={10,7,11,5,2,13,1,45};
        HeapApp.MinHeap(arr);
        HeapApp.MaxHeap(arr);
    }
        
}
