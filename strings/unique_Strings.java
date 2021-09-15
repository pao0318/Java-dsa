import java.util.*;

class Solution {
    public int solve(String s) {
        int n=s.length();
        
        int d=1;
        int ans=0;
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                d++;
                if(i==n-1)
                    ans+=(d*(d+1))/2;
            }
            else{
                ans+=(d*(d+1))/2;
                d=1;
                if(i==n-1) ans++;
            }
        }
        return Math.max(ans,n);
    }
}
