// https://www.codechef.com/START10C/status/REPEAT
import java.util.*;
class Codechef{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int s=sc.nextInt();
            s=s-(n*n);
            System.out.println(s/(k-1));
        }
    }

}
   
