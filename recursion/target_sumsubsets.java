// Java code to find the number of
// possible subset with given sum
import java.util.*;
class GFG {
	
	static int count;
	static int sum;
	static int n;
	
	// Driver code
	public static void main (String[] args) {
		count = 0;
		n = 5;
		sum = 10;

		int[] pat = {2, 3, 5, 6, 8, 10};
		
		f(pat, 0, 0);
		
		System.out.println(count);
	}
	
	// Function to select or not the array element
	// to form a subset with given sum
	static void f(int[] pat, int i, int currSum) {
		if (currSum == sum) {
			count++;
			return;
		}
		if (currSum < sum && i < n) {
			f(pat, i+1, currSum + pat[i]);
			f(pat, i+1, currSum);
		}
	}
}
