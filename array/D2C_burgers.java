import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]arr=new int[N+1];
        int[]arr1=new int[N];
        
        int ans=0;
        for(int i=0;i<N+1;i++)
            arr[i]=sc.nextInt();
            
        for(int j=0;j<N;j++)
            arr1[j]=sc.nextInt();    
        
        for(int k=0;k<N;k++){
            if(arr1[k]>=arr[k]){
                ans+=arr[k];
                arr1[k]=arr1[k]-arr[k];
                arr[k]=0;
            }
            if(arr1[k]>=arr[k+1]){
                ans+=arr[k+1];
                arr[k+1]=arr1[k];
            }
            if(arr1[k]<arr[k+1]){
                ans+=arr1[k];
                arr1[k]=0;
                arr[k+1]-=arr1[k];
            }
        }    
        System.out.println(ans);
    }
}
