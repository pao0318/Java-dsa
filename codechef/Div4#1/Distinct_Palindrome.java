/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();

            if(n<(2*x)-1){
                System.out.println(-1);
                continue;
            }
            StringBuilder s=new StringBuilder();
            for( int i=0;i<n;i++){
                s.append('a');
            }


            for(int i=1;i<x;i++){
                s.setCharAt(i-1,(char)('a'+i));
                s.setCharAt(n-i,(char)('a'+i));
            }


            System.out.println(s);


        }
	}
}




// My Solution

import java.util.*;
public class Five {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            boolean flag=false;
            if(n<(2*x)-1){
                System.out.println(-1);
                continue;
            }

            int globalfreq=n/x;
          Map<Character,Integer>map= new HashMap<>();
          char []arr= new char[n];
          char next=(char)97;
          for(int i=0;i<=n/2;i++){
              map.put(next,map.getOrDefault(next,0)+2);
              arr[i]=next;
              arr[n-i-1]=next;
              if(map.get(next)>=globalfreq)
                  next= (char)(next+1);

          }

              String res="";
            Set<Character>set= new HashSet<>();
              for(int i=0;i<arr.length;i++){
                  res+=arr[i];
                  set.add(arr[i]);
              }
              if(set.size()!=x)
                  System.out.println(-1);
              else
                System.out.println(res);

        }
    }

}


