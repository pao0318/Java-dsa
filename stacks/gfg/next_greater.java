// https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1#
class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        if(n==1)
            return arr;
        Stack<Long> stack=new Stack();
            
        long[]res=new long[n];
        
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()&& stack.peek()<=arr[i])
                stack.pop();
            if(!stack.isEmpty()&& stack.peek()>=arr[i])
                res[i]=stack.peek();
                
            else if(stack.isEmpty())
                res[i]=-1;
          
            
            
            stack.push(arr[i]);
        }
        return res;
        
    } 
}
