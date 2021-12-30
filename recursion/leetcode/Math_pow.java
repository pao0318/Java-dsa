// https://leetcode.com/explore/learn/card/recursion-i/256/complexity-analysis/2380/
class Solution {
    double ans;
    public double myPow(double x, int n) {
        if(n==0)
            return 1;
        if(x==1||n==1||x==0)
            return x;
        
        if(n<0){
            return (1/x)*myPow(1/x,-(n+1));
        }
        if(n%2==0)
            return myPow(x*x,n/2);
        else
            return x*myPow(x*x,n/2);
        
    }
}
