import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class an {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        int n=0;
        while(n++<k){
            long place= (long)(n*n)*(long)(n*n-1)/2;
            long attack= (long)(n-1)*(n-2)*4;
            if(place-attack<0)
                continue;

            System.out.println(place-attack);
        }


    }
}
