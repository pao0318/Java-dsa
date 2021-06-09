class Solution {
    public int[][] merge(int[][] intervals) {
        int[][]arr=intervals;
        Arrays.sort(intervals);
        Stack<Integer> stack= new Stack<>(); 
        stack.push(intervals[0]);
        
        for(int i=0;i<intervals.length;i++){
            Interval top=stack.push(intervals[0]);
//             Processing part 
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
