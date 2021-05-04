import java.util.*;
public class Main{
    int Binary_freq(int arr[], int n, int x, boolean searchFirst){
        int low=0; int high=n-1; int result=-1;
        while(low<=high){
            int mid=(low+high)/2;
            
            if (arr[mid]==x){
                result=mid;
                if(searchFirst)
                    high=mid-1;
                else
                    low=md+1;
            }
                
            if(arr[mid]>x)
                high=mid-1;
                
            else    
                low=mid+1;
            
        }
        return result;
    }
    
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int A[]= {1,2,3,3,3,5,5,5,5,6,8,9};
        System.out.println("Enter a Number");
        int y=sc.nextInt();
        int FirstIndex=Binary_freq(A,A.length,y, true);
        if (FirstIndex==-1)
            System.out.println("Count is 0:");
            
        else
            int LastIndex=Binary_freq(A,A.length,y,false);
            System.out.println("Count is:"+ LastIndex-FirstIndex+1);
        
    
}
