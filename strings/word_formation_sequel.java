import java.util.*;

class Solution {
    public int solve(String[] words, String letters) {
        int max=0;
        int []le=new int[26];
        int starcount=0;
        for(int i=0;i<letters.length();i++){
            char c=letters.charAt(i);
            if(c!='*')
                le[c-'a']++;
            else
                starcount++;
        }

        for(String word:words){
            int[]arr=new int[26];
            int commonelements=0;
            int rem=0;
            int tempans=0;
            for(int i=0;i<word.length();i++){
                arr[word.charAt(i)-'a']++;
            }
            for(int i=0;i<26;i++){
                commonelements+=Math.min(arr[i],le[i]);
            }
            rem=word.length()-commonelements;
            tempans=Math.min(rem,starcount)+commonelements;

             max=Math.max(tempans,max);
        }
        return max;
       
    }
}
