// https://practice.geeksforgeeks.org/problems/jump-game/1/#
class Solution {
    static int canReach(int[] A, int N) {
        int reachable=0;
        for(int i=0;i<N;i++){
            if(reachable<i)
                return 0;
            else
                reachable=Math.max(reachable, i+A[i]);
        }
        return 1;
    }
};
