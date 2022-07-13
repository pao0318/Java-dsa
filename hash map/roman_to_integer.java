// https://www.codingninjas.com/codestudio/problems/981308?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1
import java.util.*;
public class Solution {
    public static int romanToInt(String s) {
        int ans=0;
        
        Map<Character,Integer> map= new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(i==0)
                ans+=map.get(c);
            else if(map.get(c)>map.get(s.charAt(i-1))){
                ans+=map.get(c)-2*(map.get(s.charAt(i-1)));
            }
            else
                ans+=map.get(c);
        }
          return ans;
    }
  
}
