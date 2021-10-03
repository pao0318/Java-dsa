// https://practice.geeksforgeeks.org/problems/trailing-zeroes-in-factorial5134/1#
class Solution{
    static int trailingZeroes(int N){
        if(N<0)
            return -1;
        int count=0;
        
        for(int i=5;N/i>=1;i*=5)
            count+=N/i;
            
        return count;    
    }
}
