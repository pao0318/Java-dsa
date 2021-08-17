// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd
import java.util.*;

class Solution {
    public int solve(String s) {
        int isvalopen=0;
        int isvalclosed=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(')
                isvalopen++;
            else{
                if(isvalopen==0)
                    isvalclosed++;
                else
                    isvalopen--;    
            }    
        }
        return n-(isvalopen+isvalclosed);

        
    }
}
