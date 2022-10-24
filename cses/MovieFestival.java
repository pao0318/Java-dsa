import java.lang.reflect.Array;
import java.security.KeyPair;
import java.util.*;
import java.io.*;
public class MovieFestival {
    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String []a1= br.readLine().split(" ");
        int t=Integer.parseInt(a1[0]);

//        TreeMap<Long,Long>map= createTreeMap(t,br);
        ArrayList<Pair> list= createlistlongpair(t,br);
        int ans=solve(list,t);
//        printarr(array);
        System.out.println(ans);
    }
    public static int solve(ArrayList<Pair> list, int t){
        int cnt=1;
//        int maxxnt=-1;

        long prev_start=list.get(0).x;
        long prev_end=list.get(0).y;
        for(int i=1;i<list.size();i++){
            long curr_start=list.get(i).x;
            if(curr_start>=prev_end){
                cnt++;
                prev_end=list.get(i).y;
            }


        }
        return cnt;

    }

    public static ArrayList<Long> readarraylistlong(BufferedReader br) throws Exception{
        String []a= br.readLine().split(" ");
        ArrayList<Long>arr=new ArrayList<>();
        for(int i=0;i<a.length;i++)
            arr.add(Long.parseLong(a[i]));

        return arr;
    }
     public static ArrayList<ArrayList<Long>> createlistlong(int t,BufferedReader br) throws Exception{
         ArrayList<ArrayList<Long>> temp= new ArrayList<>();
         for(int i=0;i<t;i++){
             String []in= br.readLine().split(" ");
             List<Long>tt= new ArrayList<>();
             tt.add(Long.parseLong(in[0]));
             tt.add(Long.parseLong(in[1]));
             temp.add(new ArrayList<>(tt));

         }
         return temp;
     }
    public static ArrayList<Pair> createlistlongpair(int t,BufferedReader br) throws Exception{
        ArrayList<Pair> temp= new ArrayList<>();
        for(int i=0;i<t;i++){
            String []in= br.readLine().split(" ");
            temp.add(new Pair(Long.parseLong(in[0]), Long.parseLong(in[1])));

        }
        Collections.sort(temp, new Sortbyvalue());
        return temp;
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

class Pair {
    long x;
    long y;

    Pair(long x, long y) {
        this.x = x;
        this.y = y;
    }
}


    class Sortbyvalue implements Comparator<Pair> {
        // Used for sorting in ascending order of
        // roll number
        @Override public int compare(Pair a, Pair b)
        {
            return Long.compare(a.y,b.y);
        }

}
