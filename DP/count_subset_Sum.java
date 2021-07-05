// Java implementation of the approach
import java.util.*;

class GFG
{
static int maxN = 20;
static int maxSum = 50;
static int minSum = 50;
static int base = 50;

// To store the states of DP
static int [][]dp = new int[maxN][maxSum + minSum];
static boolean [][]v = new boolean[maxN][maxSum + minSum];

// Function to return the required count
static int findCnt(int []arr, int i,
				int required_sum, int n)
{
	// Base case
	if (i == n)
	{
		if (required_sum == 0)
			return 1;
		else
			return 0;
	}

	// If the state has been solved before
	// return the value of the state
	if (v[i][required_sum + base])
		return dp[i][required_sum + base];

	// Setting the state as solved
	v[i][required_sum + base] = true;

	// Recurrence relation
	dp[i][required_sum + base] =
		findCnt(arr, i + 1, required_sum, n) +
		findCnt(arr, i + 1, required_sum - arr[i], n);
	return dp[i][required_sum + base];
}

// Driver code
public static void main(String []args)
{
	int arr[] = { 3, 3, 3, 3 };
	int n = arr.length;
	int x = 6;

	System.out.println(findCnt(arr, 0, x, n));
}
}


