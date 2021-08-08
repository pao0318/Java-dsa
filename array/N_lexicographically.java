// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd

import java.util.*;

class Solution {
    public int[] solve(int n) {
        if(n==0)
            return new int[0];
        ArrayList<Integer> list=new ArrayList<>();
        int c=1;
        for(int i=0;i<n;i++)
            list.add(c+i);
        
        PriorityQueue<String> pq=new PriorityQueue<>(new Comparator<String>(){
            public int compare(String s1, String s2){
                for(int i=0;i<n;i++)
                    return s1.compareTo(s2);
            }
            return new
        
        });

        for(int j=0;j<n;j++){
            String str=String.valueOf(list.get(j));
            pq.add(str);
        }
        int[]arr=new int[pq.size()];
        for(int j=0;j<n;j++){
            arr[j]=Integer.parseInt(pq.poll());
        }
        return arr;

    }
}
