import java.util.*;
public class Main{
    static void sort(Stack<Integer> s){
        if(!s.isEmpty()){
            int x=s.pop();
            sort(s);
            pushback(s,x);
        }
    }
    static void pushback(Stack<Integer>s, int x){
    
        if(s.isEmpty()||x>s.peek()){
            s.push(x);
            return;
        }
        int temp=s.pop();
        pushback(s,x);
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
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);
         System.out.println(
            "Stack elements before sorting: ");
        printStack(s);
 
        sort(s);
 
        System.out.println(
            " \n\nStack elements after sorting:");
        printStack(s);
    }
}
