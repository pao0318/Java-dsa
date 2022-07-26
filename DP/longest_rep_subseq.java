// Java program to find the longest
// repeating subsequence

// Recursion
public class Solution {
    public int anytwo(String A) {
         int x= backtrack(A,A.length(),A.length());
         return x<=1?0:1;
    }
    
     public int backtrack(String A, int n,int m){

        if(n==0||m==0)
            return 0;
        if(A.charAt(n-1)==A.charAt(m-1) && m!=n)
            return 1+backtrack(A,n-1,m-1);
        else
            return Math.max(backtrack(A,n-1,m),backtrack(A,n,m-1));


    }
}

// DP

