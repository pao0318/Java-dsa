// https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?page=1&curated[]=1&sortBy=submissions
class Solution
{
    public static void sort012(int a[], int n)
    {
         int start=0;
         int temp=0;
         int end=n-1;
         
         while(temp<=end){
             if(a[temp]==0){
                 swap(a,start,temp);
                 start++;
                 temp++;
             }
             else if(a[temp]==1){
                 temp++;
             }
             else{
                 swap(a,temp,end);
                 end--;
             }
         }
    }
    static void swap(int[]a, int start, int end){
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
    
