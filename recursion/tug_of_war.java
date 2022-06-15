import java.util.*;
public class togufwar {
    static int min_diff=Integer.MAX_VALUE;
    static String ans="";
    public static void main(String args[]){

        int[]arr= new int[]{23, 45, -34, 12, 0, 98, -99, 4, 189, -1, 4};

        int n=arr.length;
        solve(arr,0,new ArrayList<>(),new ArrayList<>(),0,0);
        System.out.println(ans);
    }

    public static void solve(int[]arr, int idx,ArrayList<Integer>set1,
                             ArrayList<Integer>set2,int soset1,int soset2){


        if(idx==arr.length){
            int delta=Math.abs(soset1-soset2);
            if(delta<min_diff){
                min_diff=delta;
                ans=set1+" "+set2;
            }
            return;
        }
        if(set1.size()<(arr.length+1)/2){
            set1.add(arr[idx]);
            solve(arr,idx+1,set1,set2,soset1+arr[idx],soset2);
            set1.remove(set1.size()-1);
        }


        if(set2.size()<(arr.length+1)/2){
            set2.add(arr[idx]);
            solve(arr,idx+1,set1,set2,soset1,soset2+arr[idx]);
            set2.remove(set2.size()-1);
        }


    }
}
