import java.util.*;

class Solution {
    public boolean solve(int n) {
        int key=digits(n);
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
