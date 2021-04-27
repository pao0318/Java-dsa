import java.util.*;
public class Solution {
    int maxSubArray(int a[]){
        int n1=a.length;
        int csum=0;
        int osum=a[0];
        for (int i=0;i<n1; i++){
             csum=csum+a[i];
             
            if (csum>osum){
                osum=csum;
            }
            if(csum<0){
                csum=0;
                
            }
            
        }
        return csum;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int [] A= new int[n1];
        for(int j=0;j<n1;j++){
            A[j]=sc.nextInt();
            
        }
        int ans=new Solution().maxSubArray(A);
        System.out.println(ans);
        
    }
    
}

