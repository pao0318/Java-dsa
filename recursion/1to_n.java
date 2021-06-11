import java.util.*;
public class Main{
    static void print(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        print(n-1);
        System.out.print(n);
}

public static void main(String args[]) throws Exception{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    print(n);
}
}
