import java.util.*;
public class Main{
    static void print(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
            System.out.print(n);
        print(n-1);
        
}

public static void main(String args[]) throws Exception{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    print(n);
}
}
