package org.example;
import javax.lang.model.util.ElementScanner6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static final int MOD = 1_000_000_007;
    static final int MAX = 200_000;
    static long[] fact = new long[MAX + 1];
    static long[] invFact = new long[MAX + 1];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n= Integer.parseInt(input[0]);
        int T=Integer.parseInt(input[1]);
        int []arr= Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
        Arrays.sort(arr);

        int[]pre= new int[arr.length];

        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+arr[i];
        }

        while (T-- > 0) {
            int money = Integer.parseInt(br.readLine());
            solve(n,money,pre);
            }


    }
     static void solve(int n, int money, int[]pre){

        int end=n-1;
        int start=0;
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(pre[mid]<=money){
                ans=mid+1;
                start=mid+1;
            }
            else
                end=mid-1;
        }
         System.out.println(ans);


    }
}
