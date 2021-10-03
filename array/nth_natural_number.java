// https://practice.geeksforgeeks.org/problems/nth-natural-number/1#

class Solution {
    long findNth(long N)
    {
       if(N<9)
        return N;
        
        String s=helper(N, 9);
        StringBuilder ans=new StringBuilder();
        return Long.parseLong(s);
        
    }
    static String helper(long n, int b){
        StringBuilder res=new StringBuilder();
        while(n>=b){
            res.append(n%b);
            n/=b;
        }
        res.append(n);
        return res.reverse().toString();
    }
}
