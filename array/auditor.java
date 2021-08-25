// https://binarysearch.com/room/Array-of-Sunshine-GDqXz3q7mK
import java.util.*;

class Solution {
    public int solve(String s) {
        int n=s.length();
        int num=0;
        int num1=26;
        if(n==1)
            return s.charAt(0)-'A'+1;

        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            
            num=num*26+(c-'A'+1);
 
        }
        return num;
    }
}
