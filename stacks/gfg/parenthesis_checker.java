// https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1#
class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character> stack = new Stack<Character>();
        for(char c:x.toCharArray()){
            if(c=='{')
                stack.push('}');
                
            else if(c=='(')
                stack.push(')');
                
            else if(c=='[')
                stack.push(']');
             
            else if(stack.isEmpty() || stack.pop()!=c)
                return false;
               
        }
        return stack.isEmpty();
    }
}
