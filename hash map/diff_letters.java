import java.util.*;

class Solution {
    public int solve(String s, String t) {
        Map<Character,Integer> map = new HashMap();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(!map.containsKey(c)){
                count++;
            }
            else{
                int temp=map.get(c);
                if(temp==1)
                    map.remove(c);
                else
                    map.put(c,temp-1);    
            }
        }
        return count;
    }
}
