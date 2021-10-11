// https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1#
class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int i=0;
        int j=m-1;
        int res=-1;
        int max=Integer.MIN_VALUE;
        while(i<n && j>=0){
            if(arr[i][j]==1){
                j--;
                res=i;
            }
           else{
            i++;
           }
        }
        return res;
      
    }
}
