import java.util.*;
class Solution {
    public boolean solve(String s) {
        // ArrayList<Character> list=new ArrayList<>();
        boolean flag1=true;
        boolean flag2=true;
        int pos=s.indexOf('R');

            for(int i=pos;i<s.length();i++){
                if(s.charAt(i)=='B')
                    flag1=false;
            }
            for(int i=pos;i>=0;i--){
                if(s.charAt(i)=='B')
                    flag2= false;
            }
            return flag1||flag2;

        
    }
}
