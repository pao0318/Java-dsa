// https://leetcode.com/problems/remove-invalid-parentheses/
class Solution {
    public List<String> removeInvalidParentheses(String s) {
        HashSet<String> hash=new HashSet<>();
        List<String> list=new ArrayList<>();
        int mr=getmin(s);
        solution(s,mr,hash);
        
        for(String ch: hash){
            list.add(String.valueOf(ch));
        }
        return list;
     
    }
    public static void solution(String s, int mra, HashSet<String> hash){
        if(mra==0){
            int mrnow=getmin(s);
            if(mrnow==0){
                if(!hash.contains(s))
                    hash.add(s);
            }
                
         return;   
        }
        
        for(int i=0;i<s.length();i++){
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            solution(left+right, mra-1,hash);
        }
    }
    

    public static int getmin(String s){
        if(s.length()==0)
            return 0;
        Stack<Character> stack=new Stack<>();
        
        for(char ch:s.toCharArray()){
            if(ch=='(')
                stack.push(ch);
            else if(ch==')'){
                if(stack.size()==0)
                    stack.push(ch);
                else if(stack.peek()==')')
                    stack.push(ch);
                else if(stack.peek()=='(')
                    stack.pop();
            }
            
        }
        return stack.size();
    }
}
