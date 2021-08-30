import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        int []arr={1,1,0,1,0,0,1,1,0,1,0,1,1};
        int k=2;
        System.out.println(solve(arr,k));
    }
    public static int solve(int[]arr, int k){
        int ans=0;
        int j=-1;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                count++;
            if(count>k){
                j++;
                if(arr[j]==0)
                    count--;
            }
            int len=i-j;
            ans=Math.max(ans,len);
            
        }
        return ans;
    }

}
