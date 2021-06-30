import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        int wt[]={2,6,4,2,3};
        int val[]={1,8,9,5,3};
        int w=12;
        int n=wt.length;
        int t[][]=new int[n+1][w+1];
  
    for(int i=0;i<n+1;i++){
        for(int j=0;j<w+1;j++){
            t[i][j]=0;
                }
            }
    for(int i=1;i<n+1;i++){
        for(int j=1;j<w+1;j++){
            if(wt[i-1]<=j){
                t[i][j]=Math.max(val[i-1]+t[i-1][j-wt[i-1]],t[i-1][j]);
            }
            else{
                t[i][j]=t[i-1][j];
            }
        }
    }
    System.out.println(t[5][12]);
    
    }
}
