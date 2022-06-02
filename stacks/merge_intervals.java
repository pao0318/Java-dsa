class Solution {
    public int[][] merge(int[][] intervals) {
        int[][]arr=intervals;
        Arrays.sort(intervals);
        Stack<Integer> stack= new Stack<>(); 
        stack.push(intervals[0]);
        
        for(int i=0;i<intervals.length;i++){
            Interval top=stack.push(intervals[0]);

            if(top.end<arr[i].start)
                    stack.push(arr[i]);
            
            else if(top.end<arr[i].end){
                top.end=arr[i].end;
                stack.pop();
                stack.push(top);
            }
        }
        return stack;
        
    }
    
}
class Interval{
    int start, end;
    Interval(int start,int end){
        this.start=start;
        this.end=end;
    }
}


// or Better
class Solution {
    public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (a,b)->(a[0]-b[0]));
        ArrayList<int[]> list= new ArrayList<>();
        
        int start=intervals[0][0];
        int end=intervals[0][1];
        
     
        for(int i=1;i<intervals.length;i++){
            int curr_start=intervals[i][0];
            int curr_end=intervals[i][1];
            
            if(curr_start<=end ){
                start=Math.min(start,curr_start);
                end=Math.max(end,curr_end);
            }
            else{
                list.add(new int[]{start,end});
                start=curr_start;
                end=curr_end;
               
            }
        }
        list.add(new int[]{start,end});
        
        int [][] res= new int[list.size()][2];
        
        for (int i=0;i<res.length;i++){
            res[i][0]=list.get(i)[0];
            res[i][1]=list.get(i)[1];
        }
        
        return res;
        
        
    }
}
   
