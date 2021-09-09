import java.util.*;

class Solution {
    public int solve(int[][] reviews, int threshold) {
        if(threshold==0)
            return 0;
        int oldstar=0;
        int rev=0;
        for(int i=0;i<reviews.length;i++){
            oldstar+=reviews[i][0];
            rev+=reviews[i][1];
        }
        if(oldstar==rev)
            return 0;
        // double req=(threshold*rev*5)/100;
        // int have=oldstar*5;
        // System.out.println(req);
        // return Math.abs((int)req-have);
        double required=Math.ceil(((threshold*rev)-(100*oldstar))/(100-(double)threshold));
        return (int)required;
    }
}
