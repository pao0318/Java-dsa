import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int K=sc.nextInt();
        int k=K-1;
        int []arr=new int[n];
        Vector<Integer> v=new Vector<Integer>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            v.add(arr[i]);
        }
        int index=0;
        // int ans=-1;
         solve(k,index,v);
         System.out.println(v);
    }
    static void solve(int k,int index,Vector<Integer>v){
        if(v.size()==1){
            // ans=v.get(0);
            return;
        }
        index=(index+k)%(v.size());
        v.remove(index);
        solve(k,index,v);
    }
}
