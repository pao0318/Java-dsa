
// https://practice.geeksforgeeks.org/problems/triplets-with-sum-with-given-range/1/#
class Solution {
    static int countTriplets(int Arr[], int N, int L, int R) {
       int x=getcount(Arr,N,R);
       int y=getcount(Arr,N,L-1);
       return x-y;
    }
    public static int getcount(int[]Arr, int N, int val){
         if(N<3)
            return 0;
        
        int count=0;
        int low;
        int high;
        int sum=0;
        Arrays.sort(Arr);
        for(int i=0;i<N-1;i++){
            int first=Arr[i];
        
            low=i+1;
            high=N-1;
            while(low<high){
                sum=Arr[low]+Arr[high]+first;
                
                if(sum>val)
                    high--;
                else{
                    count+=high-low;
                    low++;
                }    
              
            }
            sum=0;
        }
    return count;
    }
}
