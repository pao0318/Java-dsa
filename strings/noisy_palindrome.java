import java.util.*;

class Solution {
    public boolean solve(String s) {
        Vector<Character> v=new Vector<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)<='z' &&s.charAt(i)>='a')
                v.add(s.charAt(i));
            continue;    
        }
    
    int start=0;
    int back=v.size()-1;
    while(start<back){
        if(v.get(start)!=v.get(back))
            return false;
        start++;
        back--;

    }
    return true;
    }
}
