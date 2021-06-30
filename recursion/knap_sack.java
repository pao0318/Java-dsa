import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        int wt[]={2,6,4,2,3};
        int val[]={1,8,9,5,3};
        int w=12;
        int n=wt.length;
        int ans=solve(wt,val,w,n);
        System.out.println(ans);
        
    }
    public static int solve(int []wt,int []val,int w,int n){
    if(n==0||w==0)
        return 0;
        
    if(wt[n-1]<=w)
        return Math.max(val[n-1]+solve(wt,val,w-wt[n-1],n-1),solve(wt,val,w,n-1));
    
    
    return solve(wt,val,w,n-1);
}
}
