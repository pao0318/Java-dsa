import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
	public static int Fibo(int n, int []ar){
		if(n==0||n==1)
			return n;	
		if(ar[n]!=0)
			return ar[n];
			
        	int fib1=Fibo(n-1,ar)+Fibo(n-2,ar);
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
