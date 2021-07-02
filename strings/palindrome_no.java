import java.util.*;

class Solution {
    public boolean solve(int num) {
        String s=Integer.toString(num);
        int n=s.length();
        
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false;
            }
            
        }
        return true;
    }
}
