// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd
import java.util.*;

class Solution {
    public int solve(int[] piles) {
        import java.util.*;

class Solution {
    public int solve(int[] piles) {
        Arrays.sort(piles);
        int n=piles.length/3;
        int j=piles.length-2;
        int sum=0;
        while(n>0){
            sum+=piles[j];
            j-=2;
            n--;
        }
 
        return sum;   
    }
}
