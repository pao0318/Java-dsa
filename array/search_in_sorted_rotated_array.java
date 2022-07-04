https://www.codingninjas.com/codestudio/problems/630450?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=0// 
public class Solution {
    public static int search(int arr[], int key) {
        
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=high-(high-low)/2;
            
            if(arr[mid]==key)
                return mid;
            if(arr[low]<=arr[mid]){
                if(arr[low]<=key && arr[mid]>key)
                    high=mid-1;
                else
                    low=mid+1;
            }
            else{
                  if(arr[mid]<key && arr[high]>=key)
                    low=mid+1;
                  else
                    high=mid-1;
            }
          
        }
        
        return -1;
    }
}
