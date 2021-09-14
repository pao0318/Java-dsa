import java.util.*;

class Solution {
    public int solve(int n) {
        String s=String.valueOf(n);
        boolean add=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(n>0 && c<'5' || n<0 &&c>'5'){
                s=s.substring(0,i)+'5'+s.substring(i,s.length());
                add=true;
                break;
            }
        }
        if(!add)
            s+='5';
        return Integer.parseInt(s);    

    }
}
