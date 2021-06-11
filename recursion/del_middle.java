import java.util.*;
public class Main{
    static Stack mid(Stack<Integer> s, int size){
        if(s.size()==0)
            return s;
            
        int l=s.size();   
        int k=(l/2)+1;
        solve(s,k);
        
        return s;
        
    }
    static void solve(Stack<Integer>s, int k){
       
        if(k==1){
            s.pop();
            return;
        }
        int temp=s.pop();
        solve(s,k-1);
        s.push(temp);
            
        
    }
    // printing
    static void printStack(Stack<Integer> s)
    {
        ListIterator<Integer> lt = s.listIterator();
 
        // forwarding
        while (lt.hasNext())
            lt.next();
 
        // printing from top to bottom
        while (lt.hasPrevious())
            System.out.print(lt.previous() + " ");
    }
    
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        
 
        mid(s,s.size());
 
        System.out.println(
            " \n\nStack elements after sorting:");
        printStack(s);
    }
}
