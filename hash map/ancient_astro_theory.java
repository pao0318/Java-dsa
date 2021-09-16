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
