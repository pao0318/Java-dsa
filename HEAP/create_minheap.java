/*package whatever //do not write package name here */
import java.util.*;
class GFG {

    public static void heapify(int[]arr, int n, int index){
        int largest= index;
        int left=(2*index)+1;
        int right=(2*index)+2;
        
        if(left<n && arr[left]>arr[largest])
            largest=left;
            
        if(right<n && arr[right]>arr[largest])
            largest=right;
        
        if(largest!=index) {
            int temp=arr[largest];
            arr[largest]=arr[index];
            arr[index]=temp;
            
            heapify(arr,n,largest);
        }    
    }

    public static void heap(int[]arr, int n){
        int start=(n/2)-1;
        
        for(int i=start;i>=0;i--)
            heapify(arr,n,i);
    }

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		heap(arr,n);    
		
		for(int i=0;i<n;i++)
		System.out.println(arr[i]);

	}

}
