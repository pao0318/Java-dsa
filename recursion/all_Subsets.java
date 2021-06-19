import java.util.*;
public class Main{
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String n=" ";
        int i=0;
        solve(s,n,i);
    }
    public static void solve(String ip, String op,int i){
        if(i==ip.length()){
            System.out.println(op);
            return;
        }
        solve(ip,op+ip.charAt(i),i+1);
        solve(ip,op,i+1);
 
}
}
