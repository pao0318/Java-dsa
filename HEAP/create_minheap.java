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

// Or ek long way
import java.lang.reflect.Array;
import java.util.*;
public class minheap {
    static int capacity;
    static int size;
    static int[] items;

    public minheap(int capacity){
        this.capacity=capacity;
        this.size=0;
        items= new int[this.capacity+1];
    }

    public static void main(String args[]){
        minheap obj= new minheap(15);
        Scanner sc= new Scanner(System.in);
        int s1=sc.nextInt();
        for(int i=0;i<s1;i++)
            obj.add(sc.nextInt());

        obj.print();
    }


    private static void print(){
        for (int i = 1; i <= size / 2; i++) {

            // Printing the parent and both childrens
            System.out.print(
                    " PARENT : " + items[i]
                            + " LEFT CHILD : " + items[2 * i]
                            + " RIGHT CHILD :" + items[2 * i + 1]);

            // By here new line is required
            System.out.println();
        }
    }

    private int getParentIndex(int pos){
        return (pos-1)/2;
    }
    private int getLeftChildIndex(int pos){
        return (2*pos)+1;
    }
    private int getRightChildIndex(int pos){
        return (2*pos)+2;
    }
    private boolean hasLeftChild(int pos){
        return getLeftChildIndex(pos)<size;
    }
    private boolean hasRightChild(int pos){
        return getRightChildIndex(pos)<size;
    }
    private boolean hasParent(int pos){
        return getParentIndex(pos)>=0;
    }
    private int leftChild(int pos){
        return items[getLeftChildIndex(pos)];
    }
    private int rightChild(int pos){
        return items[getRightChildIndex(pos)];
    }
    private int parent(int pos){
        return items[getParentIndex(pos)];
    }

   private  void swap(int index1,int index2){
        int temp=items[index1];
        items[index1]=items[index2];
        items[index2]=temp;
    }
    private void ensureExtraCapacity(){
        if(size==capacity){
            items= Arrays.copyOf(items, capacity*2);
            capacity*=2;
        }
    }
    public int peek(){
        if(size==0) throw new IllegalStateException();
        return items[0];
    }
    private int poll(){
        if(size==0) throw new IllegalStateException();
        int item=items[0];
        items[0]=items[size-1];
        size--;
        heapifyDown();
        return item;
    }
    public void add(int item){
        ensureExtraCapacity();
        items[size]=item;
        size++;
        heapifyUp();
    }

    public void heapifyUp(){
        int index=size-1;
        while(hasParent(index) && parent(index)>items[index]){
            swap(getParentIndex(index),index);
            index=getParentIndex(index);
        }
    }

    public void heapifyDown(){
        int index=0;
        while (hasLeftChild(index)){
            int smallerChildIndex=getLeftChildIndex(index);

            if(hasRightChild(index) && rightChild(index)<leftChild(index))
                smallerChildIndex=getRightChildIndex(index);
            if(items[index]<items[smallerChildIndex])
                break;
            else{
                swap(index,smallerChildIndex);

            }
            index=smallerChildIndex;
        }

    }



}
