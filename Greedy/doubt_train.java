import java.util.*;
public class Main{
    static getMax(int[][]arr){
    class Pair{
        int x;
        int y;
        int z;
         public Pair(int x, int y, int z){
            this.x=x;
            this.y=y;
            this.z=z;
    }
}
class PairComparator implements Comparator<Pair>{
    public int compare(Pair p1, Pair p2){
        if(p1.y<p2.y)
            return 1;
        else if(p1.y>p2.y)
            return -1;
       
    }
    return 0;
}
Arrays.sort(arr,new PairComparator());
int nStation=0;
for(int i=0;i<arr.length;i++){
    // kARTE H KUCH PRABANDH
}
    

}
public static void main(String ags[]) throws Exception{
     Scanner sc = new Scanner(System.in);
     int n=6;
     int m=3;
    Pair arr[][] = new Pair[n][m];
     arr = {{ 1000, 1030, 1,
                      1010, 1020, 1,
                      1025, 1040, 1,
                      1130, 1145, 2,
                      1130, 1140, 2 }};
                      
    System.out.println(getMax(arr);                 
    
   
  
        
}
}
//                        idhr list
import java.util.*;
public class Main{
    
    static void addEdge(ArrayList<ArrayList<Integer>>list, int u, int v,int idx){
        list.get(idx).add(u);
        list.get(idx).add(v);
        
    }
 
    public static ArrayList<ArrayList<Integer>> getMax(int[][]arr){


    ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>(3);
    for(int i=0;i<=3;i++)
        list.add(new ArrayList<Integer>());
        
    for(int i=0;i<arr.length;i++)
        addEdge(list,arr[i][1],arr[i][0],arr[i][2]);
        
    return list;
}

public static void main(String ags[]) throws Exception{
  
     int arr[][] = {{ 1000, 1030, 1},{1010, 1020, 1},{1025, 1040, 1},{1130, 1145, 2},{1130, 1140, 2 },{1150,1152,3}};
                      
    System.out.println(getMax(arr));                 

        
}
}

