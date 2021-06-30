import java.util.*;

class Solution {
    public boolean solve(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
       
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==null){
                map.put(s.charAt(i),i);
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}
