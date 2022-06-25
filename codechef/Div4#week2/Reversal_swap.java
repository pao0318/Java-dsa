//https://www.codechef.com/JUNE222D/problems/REVSORT


import java.util.*;
public class ReverseSwap{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int X = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            boolean res = false;

            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                  if(arr[i+1]+arr[i]>X){
                      res=true;
                      break;
                  }
                  else{
                      swap(arr,i,i+1);
                }
                }

            }
            if(res)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
    public static void swap(int[]arr, int start, int end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

        }
}
