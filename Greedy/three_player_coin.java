// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd
import java.util.*;

class Solution {
    public int solve(int[] piles) {
        List<Integer> list=new ArrayList<>();
        for(int key:piles)
            list.add(key);
        Collections.reverse(list); 
        int i=0;
        int sum=0;
        while(!list.isEmpty()){
            sum+=list.get(i+1);
            list.remove(i);
            list.remove(i+1);
            list.remove(list.size()-1);
            i++;
        }
        return sum;   
    }
}
