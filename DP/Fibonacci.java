import java.util.*;
import java.io.*;
public class Main{
	public static int Fibo(int n, int []ar){
		if(n==0||n==1)
			return n;
			
		if(ar[n]!=0)
			return ar[n];
			
        int fib1=Fibo(n-1,ar);
        int fib2=Fibo(n-2,ar);
		int fib=fib1+fib2;
		ar[n]=fib;

		return fib;

	}

	public static void main(String args[]) throws Exception{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fibn=Fibo(n,new int[n+1]);
		System.out.print(fibn);
	}
}
