// https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1#

class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<N;i++){
            if(!map.containsKey(arr[i]))
                map.put(arr[i],1);
            else
                map.put(arr[i], map.get(arr[i])+1);
        }
        int dig=1;
        for(int i=0;i<N;i++){
            if(map.containsKey(dig)){
                arr[i]=map.get(dig);
            }
            else
                arr[i]=0;
            dig++;    
        }
    }
}
