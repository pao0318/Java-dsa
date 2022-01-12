// https://codeforces.com/contest/1625/problem/B
import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            
            int max_len=-1;
            int curr_len=0;
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                if(!map.containsKey(arr[i]))
                    map.put(arr[i],i);
                else{
                    curr_len=n-i+map.get(arr[i]);
                    max_len=Math.max(max_len, curr_len);
                    
                }    
            }
            
           System.out.println(max_len);
    
            
        }
        
    }
}
