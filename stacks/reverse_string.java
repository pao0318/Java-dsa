class Solution {
    
    public String reverse(String S){
        int n=S.length();
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<n;i++){
            stack.push(S.charAt(i));
        }
        
        String ans="";
        while(!stack.isEmpty()){
            String a=stack.peek().toString();
            ans+=a;
            stack.pop();
        }
        return ans;
    }

}
