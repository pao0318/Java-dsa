// https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1#

class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        int[][]arr=new int[n][2];
        int len=0;
        int count=1;
        for(int i=0;i<n;i++){
            arr[i][0]=start[i];
            arr[i][1]=end[i];
        }
        Arrays.sort(arr,(a,b)-> Double.compare(a[1],b[1]));
        int j=0;
        for(int i=1;i<n;i++){
            if(arr[i][0]>arr[j][1]){
                count++;
                j=i;
            }

        }
        return count;
        
        
    }
    

}
