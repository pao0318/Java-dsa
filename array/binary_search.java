import java.util.*;
public class Main{
    public static int BinarySearch(int arr[], int x){
        int n=arr.length-1;
        int low=0;
        int mid=0;
        while(low<=n){
            mid=low+(n-low)/2;
            if (x>arr[mid]){
                low=mid+1;
            }
            if(x<arr[mid])
                n=mid-1;
                
            else    
                return mid;
            
        }
        
    return -1;    
        
    }
    
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to be searched");
        int x=sc.nextInt();
        int arr[]={1,5,9,8,6,3,4,5,2};
        int sol=BinarySearch(arr,x);
        System.out.println(sol);
    }
    
}
