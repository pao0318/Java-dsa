import java.util.*;
public class Solution {
    int counter(int a[], int n1){
        int csum=a[0];
        int osum=a[0];
        for (int i=0;i<n1; i++){
            if (csum>=0){
                csum=csum+a[i];
            }
            if (csum>osum){
                osum=csum;
            }
            else{
                csum=a[i];
                
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
        int ans=new Solution().counter(A,n1);
        System.out.println(ans);
        
    }
    
}

