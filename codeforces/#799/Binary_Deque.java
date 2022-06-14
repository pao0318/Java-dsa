import java.util.*;
public class sort_recursion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), k= sc.nextInt();
            int sum=0;
            int arr[]= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }

            int count=0;
            int left[]= new int[n+1];


            for(int i=0;i<n;i++){
                if(arr[i]==1){
                    count++;
                    left[count]=i+1;
                }
            }
            count=0;
            int right[]= new int[n+1];
            for(int i=n-1;i>=0;i--){
                if(arr[i]==1){
                    count++;
                    right[count]=n-i;
                }
            }
            int ans=Integer.MAX_VALUE;
            for(int i=0;i<=sum-k;i++){
                ans=Math.min(ans,left[i]+right[sum-k-i]);
            }
            if(ans==Integer.MAX_VALUE)
                System.out.println(-1);
            else
                System.out.println(ans);
        }
    }


}
