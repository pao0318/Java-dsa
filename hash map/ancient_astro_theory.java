import java.util.*;

class Solution {
    public boolean solve(String dictionary, String s) {
        HashMap<Character,Integer> map=new HashMap<>();
       int len=dictionary.length();
        for(int j=0;j<dictionary.length();j++){
            if(!map.containsKey(dictionary.charAt(j)))
                map.put(dictionary.charAt(j),map.getOrDefault(dictionary.charAt(j),0)+1);
        }

        int i=0;
       for(int k=0;k<s.length();k++){
           char c=s.charAt(k);
           if(map.containsKey(c)){
               while(i<len && dictionary.charAt(i)!=c)
                    i++;
               if(i>=len||dictionary.charAt(i)!=c)
                    return false;     
           }

       }
       return true;
    }
}
// OR BEST
import java.util.*;

class Solution {
    public boolean solve(String dictionary, String s) {
        Map<Character, Integer> map = new HashMap();
        int dLen = dictionary.length();
        for (int i = 0; i < dLen; i++) {
            if (map.containsKey(dictionary.charAt(i))) {
                continue;
            }
            map.put(dictionary.charAt(i), i);
        }
        int index = 0, sLen = s.length(), minVal = Integer.MIN_VALUE;
        for (int i = 0; i < sLen; i++) {
            if (!map.containsKey(s.charAt(i))) {
                continue;
            }
            if (map.containsKey(s.charAt(i))) {
                index = map.get(s.charAt(i));
            }
            if (index < minVal) {
                return false;
            }
            minVal = Math.max(index, minVal);
        }
        return true;
    }
}
