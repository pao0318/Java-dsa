import java.util.*;
public class Timur {
    public  static  void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n];

            HashSet<Integer>set= new HashSet<>();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                set.add(arr[i]);
            }

            int s=set.size();
          if((s+n)%2!=0)
                System.out.println(s-1);
            else
                System.out.println(s);

        }
    }
}
