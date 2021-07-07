import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
    Scanner sc=new Scanner(System.in);
    
    int[]arr={1,5,8,9,10,17,17,20};
    int size=arr.length;
    int ans=cutRod(arr,size);
    System.out.println(ans);
    }
    
    public static int cutRod(int[]price,int size){
        if(size<=0)
            return 0;
        int max_val=Integer.MIN_VALUE;
        
        for(int i=0;i<size;i++){
            max_val=Math.max(max_val, price[i]+cutRod(price,size-i-1));
        }
        return max_val;
    }
}
