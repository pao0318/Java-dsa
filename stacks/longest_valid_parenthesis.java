// https://leetcode.com/problems/longest-valid-parentheses/submissions/
class Solution {
    public int longestValidParentheses(String s) {
        int n=s.length();
        if(n==0)
            return 0;
        Stack<Integer> stack= new Stack<>();
        
        int max=0;
        stack.push(-1);
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(')
                stack.push(i);
            else{
                stack.pop();
                if(stack.isEmpty())
                    stack.push(i);
                else
                    max=Math.max(max,i-stack.peek());
            }

        }
        return max;
     
        
    }
}
