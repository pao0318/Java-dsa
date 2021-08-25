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
