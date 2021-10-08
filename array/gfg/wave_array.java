// https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1#
public static void convertToWave(int arr[], int n){
        
        if(n<=1)
            return;
            
        int j=1;
        for(int i=0;i<n;i+=2){
            if(i==n-1){
                break;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j+=2;
        }
        
    }
    
