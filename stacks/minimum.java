import java.util.*;
class Solution{
  public static void main(String args[]) throws Exception{
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0);
    t--;
    int n=sc.nextInt();
    Stack<Integer> s=new Stack<Integer>();
    Solution obj=new Solution();
    while(!obj.isEmpty(s)){
      obj.pop(s);
    }
    while(!obj.isFull(s,n)){
      obj.push(sc.nextInt(),s);
    }
    System.out.println(obj.min(s));
  }
}
}
class GfG{
    Stack<Integer> st=new Stack<Integer>();
	public void push(int a,Stack<Integer> s)
	{
	    s.push(a);
	    if(st.isEmpty())
	        st.push(a);
	    else{
	        if(st.peek()>a)
	            st.push(a);
	    }     
	}
	public int pop(Stack<Integer> s)
        {
            int g=s.pop();
            if(st.peek()==g)
                st.pop();
            return g;    
	}
	public int min(Stack<Integer> s)
        {
           return st.peek();
	}
	public boolean isFull(Stack<Integer>s, int n){
           if(s.size()==n)
                return true;
                
        return false;        
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           if(s.isEmpty())
            return true;
            
        return false;    
	}
}
    
 

class GfG{
    Stack<Integer> st=new Stack<Integer>();
	public void push(int a,Stack<Integer> s)
	{
	    s.push(a);
	    if(st.isEmpty())
	        st.push(a);
	    else{
	        if(st.peek()>a)
	            st.push(a);
	    }     
	}
	public int pop(Stack<Integer> s)
        {
            int g=s.pop();
            if(st.peek()==g)
                st.pop();
            return g;    
	}
	public int min(Stack<Integer> s)
        {
           return st.peek();
	}
	public boolean isFull(Stack<Integer>s, int n){
           if(s.size()==n)
                return true;
                
        return false;        
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           if(s.isEmpty())
            return true;
            
        return false;    
	}
}
