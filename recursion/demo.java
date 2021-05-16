import java.io.*;
 
public class Main {
 

static void fun1(int n)
{
   int i = 0;  
   if (n > 1)
     fun1(n - 1);
   for (i = 0; i < n; i++)
     System.out.print(" * ");
     System.out.println();
}
  
     
    public static void main (String[] args)
    {
        int a = 4;
        fun1(a);
    }
}
