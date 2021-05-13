import java.util.*;
public class Main{
    private int size;
    private int[] arr;
    private int[] top;
    private int[] next;
    int n;
    int k;
    int free;
    
    public Main(int k1,int n1){
        n=n1;
        k=k1;
        int free;
        top=new int[k];
        arr=new int[n];
        next=new int[n];
        
        for(int i=0;i<k;i++)
            top[i]=-1;
            
        free=0;    
        for (int i = 0; i < n- 1; i++)
                next[i] = i + 1;
                
        next[n - 1] = -1;    
    }
    
    boolean isFull(){
        return (free==-1);
    }
    
    void push(int item, int sn){
        if(isFull()){
            System.out.println("Overflow h bhaiya");
            return;
        }
        int i=free;
        free=next[i];
        next[i]=top[sn];
        
        top[sn]=i;
        arr[i]=item;
    }
    int pop(int sn){
        if (isEmpty(sn)) {
                System.out.println("Stack Underflow");
                return Integer.MAX_VALUE;
            }
        int i=top[sn];
        top[sn]=next[i];
        next[i]=free;
        free=i;
        
        return arr[i];
        
    }
            boolean isEmpty(int sn) {
            return (top[sn] == -1);
        }
        
        
  
        public static void main(String[] args) {
        // Let us create 3 stacks in an array of size 10
        int k = 3, n = 10;
          
        Main ks = new Main(k, n);
  
        ks.push(15, 2);
        ks.push(45, 2);
  
        // Let us put some items in stack number 1
        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);
  
        // Let us put some items in stack number 0
        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);
  
        System.out.println("Popped element from stack 2 is " + ks.pop(2));
        System.out.println("Popped element from stack 1 is " + ks.pop(1));
        System.out.println("Popped element from stack 0 is " + ks.pop(0));
    }
    
}
