// https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1?page=1&curated[]=1&sortBy=submissions
class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        int size=n;
        int i=0;
        while(size>=k && i<n){
            reverse(i,i+k-1,arr);
            i=i+k;
            size-=k;
        }
        reverse(i,n-1,arr);
    }
    
    public void reverse(int start, int end,ArrayList<Integer> arr){
        while(start<end){
            int temp=arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
        }
    }
}
