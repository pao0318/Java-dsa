import java.util.*;
public class Solution {
    public static ArrayList<Integer> subsetSum(int num[]) {
        int n=num.length;
        
        ArrayList<Integer> list= new ArrayList<>();
        helper(0,0,list,num,n);
        Collections.sort(list);
        return list;
    }

    public static void helper(int ind, int sum,ArrayList<Integer> list,int num[], int n ){
        if(ind==n){
            list.add(sum);
            return;
        }
       
        helper(ind+1,sum+num[ind],list,num,n);
        helper(ind+1, sum,list,num,n);
    }

}
