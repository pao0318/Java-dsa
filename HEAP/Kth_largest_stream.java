import java.util.*;
public class kth_largest {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        k=k-1;
        int[]arr= new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++) pq.add(arr[i]);

        if(k<n){
            while(k-->0)
                pq.remove();
        }

        System.out.println(pq.peek());

    }
}
