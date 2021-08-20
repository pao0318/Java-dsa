import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cp=countPathTab(n);
        System.out.println(cp);
    }
    public static int countPathTab(int n){
        int[] arr=new int[n+1];
        arr[0]=1;
        for(int i=1;i<n+1;i++){
            if(i==1)
                arr[i]=arr[i-1];
            
            else if(i==2)
                arr[i]=arr[i-1]+arr[i-2];                
            
            else{
            arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
        }
        }
        return arr[n];
        
    }
}
