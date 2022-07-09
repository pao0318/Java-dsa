// https://leetcode.com/problems/largest-rectangle-in-histogram/
class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n=heights.length;
        int[]left_small=new int[n];
        
        Stack<Integer> stack= new Stack();
        
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[i]<=heights[stack.peek()])
                stack.pop();
            
            left_small[i]=stack.isEmpty()?0:stack.peek()+1;
            stack.push(i);
            
        }
        
        while(!stack.isEmpty())
            stack.pop();
        
        int []right_small= new int[n];
        
        for(int i=n-1;i>=0;i--){
             while(!stack.isEmpty() && heights[i]<=heights[stack.peek()])
                stack.pop();
            
            right_small[i]=stack.isEmpty()?n-1:stack.peek()-1;
            stack.push(i);
        }
        
        int maxArea=0;
        for(int i=0;i<n;i++){
            maxArea=Math.max(maxArea,  (right_small[i]-left_small[i]+1)*(heights[i]));
            
            
        }
        return maxArea;
        
        

    }
}
