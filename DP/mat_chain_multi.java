import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int i=1;
        int j=arr.length-1;
        System.out.println(solve(arr,i,j));
    }
    static int solve(int[]arr,int i,int j){
        if(i>=j)
            return 0;
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp=solve(arr,i,k)+solve(arr,k+1,j) + (arr[i-1]*arr[k]*arr[j]);
            min=Math.min(min,temp);
        }    
        return min;
    }
}
// Memoized
import java.io.*;
import java.util.*;
class GFG
{
 
  static int[][] dp = new int[100][100];
 
  // Function for matrix chain multiplication
  static int matrixChainMemoised(int[] p, int i, int j)
  {
    if (i == j) 
    {
      return 0;
    }
    if (dp[i][j] != -1) 
    {
      return dp[i][j];
    }
    dp[i][j] = Integer.MAX_VALUE;
    for (int k = i; k < j; k++) 
    {
      dp[i][j] = Math.min(
        dp[i][j], matrixChainMemoised(p, i, k)
        + matrixChainMemoised(p, k + 1, j)
        + p[i - 1] * p[k] * p[j]);
    }
    return dp[i][j];
  }
 
  static int MatrixChainOrder(int[] p, int n)
  {
    int i = 1, j = n - 1;
    return matrixChainMemoised(p, i, j);
  }
 
  // Driver Code
  public static void main (String[] args)
  {
 
    int arr[] = { 1, 2, 3, 4 };
    int n= arr.length;
 
    for (int[] row : dp)
      Arrays.fill(row, -1);
 
    System.out.println("Minimum number of multiplications is " + MatrixChainOrder(arr, n));
  }
}
