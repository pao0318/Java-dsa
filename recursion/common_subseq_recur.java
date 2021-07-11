
import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s2=sc.nextLine();
        int n=s.length();
        int m=s2.length();
        int ans=count(s,s2,n,m);
        System.out.println(ans);
    }
    static int count(String s1,String s2,int n,int m){
        if(n==0||m==0)
            return 0;
        if(s1.charAt(n-1)==(s2.charAt(m-1)))
            return 1+count(s1,s2,n-1,m-1);
        
        return Math.max(count(s1,s2,n,m-1),count(s1,s2,n-1,m));
            
    
            
    }
}
