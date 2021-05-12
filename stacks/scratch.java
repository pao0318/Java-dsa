import java.util.*;
public class Main{
    private int size;
    private int[] stackArray;
    private int top;
    
    public Main(int s){
        size=s;
        stackArray=new int[size];
        top=-1;
    }
    public void push(int j){
        top++;
        stackArray[top]=j;
    }
    public int pop(){
        return stackArray[top--];
    }
    public int peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (top==size-1);
    }
    
    public static void main(String[] args)throws Exception{
        Main stack=new Main(10);
        stack.push(10);
        stack.push(30);
        stack.push(8);
        stack.push(0);
        
        while(!stack.isEmpty()){
            int val=stack.pop();
            System.out.println(val);
            System.out.println(" ");
        }
        System.out.println("");
    }
}
