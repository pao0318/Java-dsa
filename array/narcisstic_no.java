import java.util.*;

class Solution {
    public boolean solve(int n) {
        int key=digits(n);
//         or
//         int length = (int) Math.log10(n) + 1;
//         to get number of digits in number O(logn) complexity
        int c=cube(n,key);
        if(c==n)
            return true;

        return false;    
    }
    public int cube(int l,int key){
        int sum=0;int rem=0;
        while(l>0){
            rem=l%10;
            sum+=Math.pow(rem,key);
            l=l/10;
        }
        return sum;
    }
    public int digits(int l){
        int count=0;
        while(l>0){
            l=l/10;
            count++;
        }
        return count;
    }
}
