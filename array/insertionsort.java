import java.util.*;
public class InsertionSort{
    
    void sort(int arr[]){
        int n=arr.length;
        
        for(int i=1;i<n;i++){
            int val=arr[i];
            int index=i;
            while(index>0 && val<arr[index-1]){
                arr[index]=arr[index-1];
                index=index-1;
            }
            arr[index]=val;
        }
    }
    
    static void printArray(int arr[]){
        int n=arr.length;
        for (int i=0;i<n;i++)
            System.out.println(arr[i]+ " ");
            
        System.out.println();    
    }
    public static void main(String args[]){
        int arr[] = { 12, 11, 13, 5, 6 };
 a
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
 
        printArray(arr);
    }
    
}
