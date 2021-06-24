import java.util.*;

class Solution {
    public boolean solve(String s, String t) {
        char[]a=s.toCharArray();
        char[]b=t.toCharArray();
        int map[]=new int[26];
        int n=s.length();
        // HashMap <Character,int> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map[a[i]-'a']++;
            map[b[i]-'a']++;
        }
        for(int i:map){
            if(i%2!=0)
                return false;
        }
            return true;    
        


        
    }
}
