// https://leetcode.com/contest/weekly-contest-300/problems/number-of-people-aware-of-a-secret/
class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {

        long[] dp = new long[n + 1];
        dp[1] = 1; // given
        long share = 0;
        long MOD = (long) (1e9 + 7);
        int time = 2;
        while (time <= n) {
            if (time - delay > 0) {
                share = (share + dp[time - delay] + MOD) % MOD;
            }
            if (time - forget > 0) {
                share = (share - dp[time - forget] + MOD) % MOD;
            }
            dp[time] = share;
         time++;
        }

        long peopleWhoKnow = 0;
        for (int i = n - forget + 1; i <= n; i++) {
            peopleWhoKnow = (peopleWhoKnow + dp[i]) % MOD;
        }
        return (int) (peopleWhoKnow % MOD);
        
    }
}
