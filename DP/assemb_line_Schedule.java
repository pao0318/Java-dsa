// https://www.geeksforgeeks.org/assembly-line-scheduling-dp-34/
import java.util.*;

public class Main
{
	static int NUM_LINE = 2;
	static int NUM_STATION = 4;
	

	
	static int carAssembly(int a[][], int t[][], int e[], int x[])
	{
		int T1[]= new int [NUM_STATION];
		int T2[] =new int[NUM_STATION] ;
		int i;

		T1[0] = e[0] + a[0][0];
	
		T2[0] = e[1] + a[1][0];
	
		for (i = 1; i < NUM_STATION; ++i)
		{
			T1[i] = Math.min(T1[i - 1] + a[0][i],
					T2[i - 1] + t[1][i] + a[0][i]);
			T2[i] = Math.min(T2[i - 1] + a[1][i],
					T1[i - 1] + t[0][i] + a[1][i]);
		}
	
		// Consider exit times and retutn minimum
		return Math.min(T1[NUM_STATION-1] + x[0],
					T2[NUM_STATION-1] + x[1]);
	}
	
	
	// Driver code
	public static void main (String[] args) throws Exception
	{
		int a[][] = {{4, 5, 3, 2},
					{2, 10, 1, 4}};
		int t[][] = {{0, 7, 4, 5},
					{0, 9, 2, 8}};
		int e[] = {10, 12}, x[] = {18, 7};
	
		System.out.println(carAssembly(a, t, e, x));
	
	}
}
