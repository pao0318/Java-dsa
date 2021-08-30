import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int i=1;
        int j=arr.length-1;
        System.out.println(solve(arr,i,j));
    }
    static int solve(int[]arr,int i,int j){
        if(i>=j)
            return 0;
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp=solve(arr,i,k)+solve(arr,k+1,j) + (arr[i-1]*arr[k]*arr[j]);
            min=Math.min(min,temp);
        }    
        return min;
    }
}
