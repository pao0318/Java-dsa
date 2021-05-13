import java.util.*;
public class Main{
    private int size;
    private int[] arr;
    private int[] top;
    private int[] next;
    
    public Main(int k,int s){
        size=s;
        int free;
        top=new int[k];
        arr=new int[size];
        next=new int[size];
        
        for(int i=0;i<k;i++)
            top[i]=-1;
            
        free=0;    
        for (int i = 0; i < size - 1; i++)
                next[i] = i + 1;
                
        next[size - 1] = -1;    
    }
    
    boolean isFull(){
        return (free==-1)
    }
    
    void push(int item, int sk){
        if(isFull()){
            System.out.println("Overflow h bhaiya");
            return;
        }
        
    }
    
}
