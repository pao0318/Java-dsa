// https://www.interviewbit.com/problems/maximum-sum-combinations/
import java.util.*;
class Pair{
    int sum;
    int first;
    int second;
    Pair(int sum,int first, int second){
        this.sum=sum;
        this.first=first;
        this.second=second;
    }
}

class PairComparator implements Comparator<Pair>{
 public int compare(Pair p1,Pair p2){
        if(p1.sum<p2.sum)
            return 1;
        else if(p1.sum>p2.sum)
            return -1;
        return 0;
    }
}
public class Solution {

    public int[] solve(int[] A, int[] B, int C) {
        int N=A.length;
        Arrays.sort(A);
        Arrays.sort(B);
        
        // For sum maintain a PriorityQueue
        PriorityQueue<Pair> maxheap = new PriorityQueue<>( new PairComparator());
        maxheap.add(new Pair((A[N-1]+B[N-1]), N-1, N-1));
        
        // for index use hashset
        HashSet<String> hashindex = new HashSet<>();
        hashindex.add(new String((N-1)+" "+ (N-1)));
        
        // Result
        int[]res= new int[C];
        int i=N-1;
        int j=N-1;
       
        int y=0;
        
        for(int p1=0;p1<C;p1++){
            Pair p=maxheap.poll();
            int sum=p.sum;
            i=p.first;
            j=p.second;
            res[y]=sum;
            y++;
            
            
            // check for i-1,j in HashSet
            if(i>0 && j>0 ){
            if(!hashindex.contains(new String((i-1)+" "+j))){
                hashindex.add(new String((i-1)+" "+j));
                maxheap.add(new Pair((A[i-1]+B[j]),i-1,j));
            }
            // check for i,j-1 in HashSet
            if(!hashindex.contains(new String((i)+" "+(j-1)))){
                hashindex.add(new String((i)+" "+(j-1)));
                maxheap.add(new Pair((A[i]+B[j-1]),i,j-1));
            }
            }

        }
        return res;
        
        
        
    }
}



