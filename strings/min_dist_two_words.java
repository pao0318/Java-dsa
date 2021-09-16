import java.util.*;

class Solution {
    public int solve(String text, String word0, String word1) {
        int ans=Integer.MAX_VALUE;
        Integer list1=null;
        Integer list2=null;

        String str[]=text.split(" ");
        for(int i=0;i<str.length;i++){
            String w=str[i];
            if(w.equals(word0))
                list1=i;
            if(w.equals(word1))
                list2=i;

            if(list1!=null && list2!=null)
                ans=Math.min(ans,Math.abs(list1-list2)-1);


        }
        if(list1==null ||list2==null)
            return -1;

        return ans;
    }
}
