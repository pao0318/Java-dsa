import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        long mod = 1000000007;
        long base =2;
        long res=1;
        while(n>0){
            if((n&1)==1)
                res=(res*base)%mod;
            base=(base*base)%mod;
            n>>=1;
        }
        System.out.print(res);
    }
}
