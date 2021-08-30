// https://www.codechef.com/START10C/problems/HARDBET/
import java.util.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
		int Sa=sc.nextInt();
		int Sb=sc.nextInt();
		int Sc=sc.nextInt();
		int min=Integer.MAX_VALUE;
		
		min=Math.min(Sa, Math.min(Sb,Sc));
		if(min==Sa)
		    System.out.println("Draw");
		else if(min==Sb)
		    System.out.println("Bob");
		else
		    System.out.println("Alice");
		Sa=0;
		Sb=0;
		Sc=0;

		}
		
		
	}
}
