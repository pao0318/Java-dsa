// https://www.codingninjas.com/codestudio/problems/1112621?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1
import java.util.*;
public class Solution {
    public static void lpsify(String p, int[]lps){
        lps[0]=0;
        int i=1;
        int prev=0;
        while(i<p.length()){
            if(p.charAt(i)==p.charAt(prev)){
                prev++;
                lps[i]=prev;
                i++;
            }
            else{
                if(prev!=0){
                    prev=lps[prev-1];
                }
                else{
                    lps[i]=prev;
                    i++;
                }
            }
        }
        
    }
    
    public static boolean findPattern(String p, String s) {
        int m=p.length();
        int[]lps= new int[p.length()];
        lpsify(p, lps);
        int j=0;
        int i=0;
        
        List<Integer> list=new ArrayList<>();
        
        while(i<s.length()){
            if(p.charAt(j)==s.charAt(i)){
                i++;
                j++;
            }
            if(j==m){
                list.add(i-j);
                j=lps[j-1];
            }
            else if(i<s.length() &&p.charAt(j)!=s.charAt(i) ){
                if(j!=0)
                    j=lps[j-1];
                else
                    i=i+1;
            }
        }
        
        return list.size()>0;
        

        
    }
    
    
}
