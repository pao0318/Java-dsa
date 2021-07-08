class Solution {
    public int climbStairs(int n) {
        int[]qb=new int[n+1];
        int ans=solve(n,qb);
        return ans;
    }
    public int solve(int n,int[]qb){
        if(n==0)
            return 1;
        if(n<0)
            return 0;
        if(qb[n]>0)
            return qb[n];
        int path1=solve(n-1,qb);
        int path2=solve(n-2,qb);
        int cp=path1+path2;
        qb[n]=cp;
        
        return cp;
    }
}
