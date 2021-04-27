import java.util.*;
class Maxsub{
    int counter(int a[], double n){
        int csum=a[0];
        int osum=a[0];
        for (int i=0;i<n; i++){
            if (csum>=0){
                csum+=a[i];
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
        double n1=sc.nextDouble();
        int A[]= new int[n1];
        for(int j=0;j<n1;j++){
            A[j]=sc.nextInt();
            
        }
        int ans=new Maxsub().counter(A,n1);
        System.out.println(ans);
        
    }
    
}
