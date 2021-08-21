// 
import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            for(int j=0;j<i;j++)
                dp[i]+=dp[j]*dp[i-j-1];
        }
        System.out.println(dp[n]);
    }
}
// Efficient approach
// Java program for nth Catalan Number

public class Main {

	// Returns value of Binomial Coefficient C(n, k)
	static long binomialCoeff(int n, int k)
	{
		long res = 1;

		// Since C(n, k) = C(n, n-k)
		if (k > n - k) {
			k = n - k;
		}

		// Calculate value of [n*(n-1)*---*(n-k+1)] /
		// [k*(k-1)*---*1]
		for (int i = 0; i < k; ++i) {
			res *= (n - i);
			res /= (i + 1);
		}

		return res;
	}

	// A Binomial coefficient based function
	// to find nth catalan number in O(n) time
	static long catalan(int n)
	{
		// Calculate value of 2nCn
		long c = binomialCoeff(2 * n, n);

		// return 2nCn/(n+1)
		return c / (n + 1);
	}

	// Driver code
	public static void main(String[] args)
	{
		for (int i = 0; i < 10; i++) {
			System.out.print(catalan(i) + " ");
		}
	}
}
