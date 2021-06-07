class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        for(int i=0;i<=r;i++)
            heap.add(arr[i]);
            
        if(r==0)
            return 0;
            
        for(int i=0;i<k-1;i++)
            heap.poll();
    
    return heap.peek();
    }
    
}
