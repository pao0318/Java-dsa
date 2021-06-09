// import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
//         Sorting array inreasing order
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
//         Creating linkedlist as size of output will be unkown
        LinkedList<int[]> list=new LinkedList<>();
//         Now for every linkedlist it will check the original arrays last element
        for(int[] interval:intervals){
            if(list.isEmpty()|| list.getLast()[1]<interval[0])
                list.add(interval);
            else
                list.getLast()[1]=Math.max(list.getLast()[1],interval[1]);  
        }
        return list.toArray(new int[list.size()][]);
        
    }
}
