// https://leetcode.com/problems/unique-paths/
import java.util.*;
public class countpaths {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        int c=sc.nextInt();


        int arr[][]=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                arr[i][j]=-1;
        }

        System.out.println(countunique(arr,0,0,r,c));

    }
    public static int countunique(int [][]arr, int i, int j, int r, int c){
        if(i==r-1 && j==c-1)
            return 1;
        if(i>=r || j>=c)
            return 0;
        if(arr[i][j]!=-1)
            return arr[i][j];
        else
            return arr[i][j]=countunique(arr,i+1,j,r,c)+countunique(arr,i,j+1,r,c);

    }
}


// Or


import java.util.*;
public class countpaths {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        int c=sc.nextInt();

        int N=r+c-2;
        int m=r-1;

        double ans=1.0;
        for(int i=1;i<=m;i++)
            ans=ans*(N-m+i)/i;

        System.out.println(ans);

    }

}

// or better dp
public class Solution {
	public static int uniquePaths(int m, int n) {
		// Reference array to store subproblems.
		int[] dp = new int[n];
		dp[0] = 1;

		// Bottom up approach.
		for (int i = 0; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[j] += dp[j - 1];
			}
		}
		
		// Returning answer.
		return dp[n - 1];
	}
}
