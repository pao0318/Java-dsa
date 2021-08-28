import java.util.*;

class Solution {
    public String solve(String[] words) {
        int len=words.length;
        if(len==0)
            return "";
        if(len==1)
            return words[0];   
        Arrays.sort(words);
        int minlen=Math.min(words[0].length(), words[len-1].length());

        int i=0;
        while(i<minlen && words[0].charAt(i)==words[len-1].charAt(i))
            i++;
        String res=words[0].substring(0,i);
        return res;

    }
}
