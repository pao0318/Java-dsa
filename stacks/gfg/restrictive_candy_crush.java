// https://practice.geeksforgeeks.org/problems/8c8f95810b05b4cab665f2997d36991bd58308a2/1/#
class Solution
{
    public static String reduced_String(int k, String str)
{
// Your code goes here
    int n = str.length();
        
        Stack<MyObject> s = new Stack<>();
        
        for(int i=0; i<n; i++){
            int count = 1;
            char c = str.charAt(i);
            
            if(!s.isEmpty() && s.peek().c == c)
            {
                count = s.peek().count + 1;
            }
            
            
            s.push(new MyObject(c, count));
            if(count == k){
                while(count > 0 && !s.isEmpty()){
                    s.pop();
                    count--;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop().c);
        }
        
        return sb.reverse().toString();
    }
}
class MyObject{
    char c;
    int count;
    
    MyObject(char c, int count){
        this.c = c;
        this.count = count;
    }
}
