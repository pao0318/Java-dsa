// https://www.codechef.com/JUNE222D/problems/STRNG

import java.util.*;
public class C{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            int[] dp1 = new int[n];
            int[] dp2 = new int[n];
           int count=0;
            int t1 = 0;
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            if(n==1){
            System.out.println(1);
            continue;
            }

            dp1[0] = arr[0];
            dp2[n-1]=arr[n-1];
            for (int i = 1; i < n; i++)
                dp1[i] = findGCD(dp1[i - 1], arr[i]);
            for (int i = n - 2; i >= 0; i--)
                dp2[i] = findGCD(dp2[i + 1], arr[i]);

            if(dp1[n-1]!=1){
                System.out.println(n);
                continue;
            }
                for (int i = 0; i < n; i++) {
                   if(dp1[i]==1){
                       if(i==0 ){
                           if(dp2[i+1]!=1)
                                count++;
                           else
                               continue;
                       }
                       else if(i==n-1){
                          if(dp1[i-1]!=1)
                              count++;
                          else
                              continue;
                       }
                       else if(findGCD(dp1[i-1],dp2[i+1])!=1)
                           count++;
                       }
                   }
            System.out.println(count);
                }
            }


    public static int findGCD(int x, int y)
    {
        int r=0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number
        r = b;
        while(a % b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
}
