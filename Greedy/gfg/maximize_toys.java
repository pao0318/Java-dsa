// https://practice.geeksforgeeks.org/problems/maximize-toys0331/1
class Solution{
    static int toyCount(int N, int K, int arr[])
    {
        Arrays.sort(arr);
        int count1=0;
        for(int i=0;i<N;i++){
            if(arr[i]<=K){
                K-=arr[i];
                count1++;
            }
            else
                break;
        }
        return count;
    }
}
