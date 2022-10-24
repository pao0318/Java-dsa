import java.util.*;
import java.io.*;
public class Res {
    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String []a1= br.readLine().split(" ");
        int t=Integer.parseInt(a1[0]);

        TreeMap<Long,Long>map= createTreeMap(t,br);
        int ans=solve(map,t);
//        printarr(array);
        System.out.println(ans);
    }
    public static int solve(TreeMap<Long,Long>map, int w){
        int cnt=0;
        int maxxnt=-1;
        for(Map.Entry<Long,Long> x: map.entrySet()){
            cnt+=x.getValue();
            maxxnt=Math.max(cnt,maxxnt);

        }
        return maxxnt;

    }

    public static ArrayList<Long> readarraylistlong(BufferedReader br) throws Exception{
        String []a= br.readLine().split(" ");
        ArrayList<Long>arr=new ArrayList<>();
        for(int i=0;i<a.length;i++)
            arr.add(Long.parseLong(a[i]));

        return arr;
    }

    public static long[]readarraylong(int n,BufferedReader br) throws Exception{
        String []a= br.readLine().split(" ");
        long[]arr=new long[a.length];
        for(int i=0;i<arr.length;i++)
            arr[i]=Integer.parseInt(a[i]);

        return arr;
    }
    public static int[]readarr(int n,BufferedReader br) throws Exception{
        String []a= br.readLine().split(" ");
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(a[i]);

        return arr;
    }
    public static void printarr(long[]arr) {
        int sizearr = arr.length;
        for (int i = 0; i < sizearr; i++)
            System.out.print(arr[i] + " ");
    }



    public static TreeMap<Long, Long> createTreeMap(int n, BufferedReader br) throws Exception{
        TreeMap<Long, Long>temp= new TreeMap<>();
        for(int i=0;i<n;i++){
            String[]in=br.readLine().split(" ");
            temp.put(Long.parseLong(in[0]),1l);
            temp.put(Long.parseLong(in[1]),-1l);
        }
        return temp;
        }
}
