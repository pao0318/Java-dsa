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



// Solution
class Solution {
    public int[] solve(int n) {
        List<Integer> input = new ArrayList<>();
        List<Integer> result = formSeries(1, n, input);
        int[] arr = new int[result.size()];
        int idx = 0;
        for (int data : result) {
            arr[idx] = data;
            idx++;
        }

        return arr;
    }

    private List<Integer> formSeries(int i, int n, List<Integer> list) {
        if (i > n) {
            List<Integer> baseList = new ArrayList<>();
            return baseList;
        }

        list.add(i);
        formSeries(i * 10, n, list);

        if (i % 10 != 9)
            formSeries(i + 1, n, list);
        return list;
    }
}
