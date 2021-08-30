// https://www.codechef.com/START10C/problems/SIGNFLIP/
import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int N=sc.nextInt();
            int K=sc.nextInt();
            int[]arr=new int[N];
            for(int j=0;j<N;j++)
                arr[j]=sc.nextInt();
             
            
            System.out.println(helper(N,K,arr));
        }
            
        }
        static int helper(int N, int K, int[]arr){
            Arrays.sort(arr);

            for(int k=0;k<K;k++){
                if(arr[k]<0){
                    arr[k]=arr[k]*-1;
                }
            }
            int sum=0;
            for(int j:arr){
                if(j<0)
                continue;
                sum+=j;
            }
            return sum;
          
        
    }
}
