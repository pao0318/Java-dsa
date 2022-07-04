// https://www.codingninjas.com/codestudio/problems/chess-tournament_981299?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1
import java.util.Arrays;

public class Solution 
{
    public static int chessTournament(int[] positions, int n, int c) 
    {        
        // Sorting all positions of empty rooms
        Arrays.sort(positions);
        int res=0;
       
        int ans = 0, l = 1,  r = positions[n - 1]-positions[0];
        while(l<=r){
            int mid = (l+r)/2;
            if(isValid(mid,positions,n,c)){
                res=mid;
                l=mid+1;
            }
            else
                r=mid-1;
        }
        return res;
   
    }
    
    public static boolean isValid(int distance, int[]positions, int n, int c){
        int x=1;
        int prev=positions[0];
        for(int i=1;i<n;i++){
            if((positions[i]-prev)>=distance){
                prev=positions[i];
                x++;
            }
            
        }
        return x>=c;
    }
}
