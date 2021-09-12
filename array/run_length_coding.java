import java.util.*;

class Solution {
    public String solve(String s) {
        StringBuilder str=new StringBuilder();
        String x="";
        int c=0;
        for(int i=0;i<s.length();i++){
            boolean flag=Character.isDigit(s.charAt(i));
            if(flag){
                x+=s.charAt(i); 
            }
            else{
                int t=Integer.parseInt(x);
                for(int j=0;j<t;j++)
                    str.append(s.charAt(i));
                    x="";
            }
        }
        return str.toString();
    }
}
