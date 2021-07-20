// https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1
class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
   HashMap<Integer , Integer> map = new HashMap<>();
    for( int i =0 ; i < n ; i++){
        if( !map.containsKey(start[i])){
            map.put( start[i] , end[i]);
            }
        else{
            int temp = Math.min(map.get(start[i]) , end[i]);
            map.put( start[i] , temp);

            }
}
    Arrays.sort(start);
    int i = 1 ;
    int end1 = map.get(start[0]);
    int ans = 1;
    while( i < n ){
        if( end1 < start[i] ) {
            ans++;
            end1 = map.get(start[i]);
            i++;
}
        else{
            if( map.get( start[i]) < end1)
                end1 = map.get(start[i]);
                i++;
                }
        }
return ans;

}
}
