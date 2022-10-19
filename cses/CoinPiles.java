import java.io.*;
import java.util.*;
public class Main{
    public static void main (String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        
        while(t-->0){
            String a1=br.readLine();
            String[]arr=a1.split(" ");
            long a=Long.parseLong(arr[0]);
            long b=Long.parseLong(arr[1]);
            
            
            if ((a+b)%3==0 && Math.max(a,b)<=2*Math.min(a,b))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        
    }
}
