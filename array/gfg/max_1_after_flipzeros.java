// https://practice.geeksforgeeks.org/comments/maximize-number-of-1s0905/1/?rel=https://practice.geeksforgeeks.org/problems/maximize-number-of-1s0905/1
class Solve {
    // m is maximum of number zeroes allowed to flip
    int findZeroes(int arr[], int n, int m) {
        
        int i=0;
        int j=0;
        int res=0;
        int count=0;
        while(j<n){
            if(arr[j]==0)
                count++;
                
            while(count>m){
                if(arr[i]==0)
                    count--;
                i++;
            }    
                
        res=Math.max(res,j-i+1);        
        j++;        
        }
        
        return res;
    }
}
