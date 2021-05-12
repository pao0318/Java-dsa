import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        Stack stack1=new Stack();
        Stack<String> stack2=new Stack<String>();
        stack1.push(4);
        stack2.push("Yoyo");
        stack1.push(7);
        stack2.push("Lelo");
        stack1.push(0);
        stack1.pop();
        stack2.pop();
        
        System.out.println(stack1);
        System.out.println(stack2);
        
        
    }
    
}
