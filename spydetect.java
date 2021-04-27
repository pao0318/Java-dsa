import java.util.*;
import java.lang.Math.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int n=sc.nextInt();
            int []a= new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                
            }
            // initialization
            int ans=0;
            // forloop
            for (int i=0;i<n-2;i++){
                int a1=a[i];
                int a2=a[i+1];
                int a0=a[i+2];
                
                    if (a1==a2)
                        ans=i+2;
                    
                    if(a2==a0)
                        ans=i;
                        
                    else
                        ans=i+1;
                        
                        
                }
                System.out.println(ans+1);
            
        }
    }
}
