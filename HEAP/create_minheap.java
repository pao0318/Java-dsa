import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        int []arr={ 1, 3, 5, 4, 7,6,2,0, 17 };
        int n=arr.length;
        buildHeap(arr,n);
        
        printHeap(arr,n);
    }
     
     static void buildHeap(int[]arr, int n){
         // Index of last non-leaf node
         int startidx=(n/2)-1;
         // Perform reverse level order traversal
        // from last non-leaf node and heapify
        // each node
        for(int i=startidx;i>=0;i--)
            heapify(arr,n,i);
         
     }
     static void heapify(int []arr, int n, int i){
        //  INitialize smallest as root
        int smallest=i;
        int l=2*i+1; // left=2*i+1
        int r=2*i+2; // right=2*i+2
        
        // If left child is larger than root;
        if(l<n && arr[l]<arr[smallest])
            smallest=l;
            
        //If right child is larger than smallest so far
        if(r<n && arr[r]<arr[smallest])
            smallest=r;
        // If smallest is not root
        if(smallest!=i){
            swap(arr,i,smallest);
            heapify(arr,n,smallest);
        }

     }
     
     static void printHeap(int arr[], int n){
         for(int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
         }
         System.out.println();
         
     }
     
     static void swap(int []arr, int i, int smallest){
         int temp=arr[i];
         arr[i]=arr[smallest];
         arr[smallest]=temp;
     }
     
    
    
}
