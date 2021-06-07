
class Compute {
    
    public void rotate(long arr[], long n){
        Stack <Long> stack=new Stack<Long>();
        
        for(int i=(int)n-2;i>=0;i--)
            stack.push(arr[i]);
        
        stack.push(arr[(int)n-1]);
        for(int i=0;i<n;i++)
            arr[i]=stack.pop();
    }
}
