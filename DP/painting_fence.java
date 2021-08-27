// https://practice.geeksforgeeks.org/problems/painting-the-fence3727/1#
class Solution
{
    long countWays(int n,int k)
    {
        if(n==1)
            return k;
        int mod=1000000007;
        long same=(k*1)%mod;
        long diff=((k%mod)*((k-1)%mod))%mod;
        long total=same+diff;
        for(int i=3;i<=n;i++){
            same=diff*1;
            diff=(total*(k-1))%mod;
            total=(same+diff)%mod;
        }
        return total;
    }
}
