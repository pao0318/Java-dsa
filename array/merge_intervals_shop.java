import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int [][]counters=new int[M][2];
        int i=0;
        int j=0;
        for(i;i<N;i++){
            for(j;j<2;j++){
                counters[i][j]=sc.nextInt();
            }
        }
        i=0;
        for(i;i<counters.length-1;i++){
            j=i+1;
            if(counters[j][0]>counters[i][1] && counter[j][1]>counter[i][1]){
                int start=Math.max(counters[j][0], counters[i][0]);
                int end=Math.min(counters[j][1], counters[i][1]);
                counters[j][0]=start;
                counters[j][1]=end;
            }
        }
        
    System.out.println(counters[N-1][1]-counters[N-1][0]+1);
        
    }
    
    
}
// time lagega
