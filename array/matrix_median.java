// https://www.codingninjas.com/codestudio/problems/873378?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1
import java.util.*;

public class Solution
{
    public static int upper_bound(ArrayList<Integer> mat, int low, int high, int val){
        while(low<high){
            int mid1=(low+high)/2;
            if(mat.get(mid1)<=val)
                low=mid1+1;
            else
                high=mid1;
        }
        return low;
    }

    
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		int n=matrix.size();
        int m=matrix.get(0).size();
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
          min=Math.min(min, matrix.get(i).get(0));
          max=Math.max(max, matrix.get(i).get(m-1));
      }
        
        while(min<max){
            
            int mid = (min+max)/ 2;
             // To count number of elements less than or equal to "mid".
            int count = 0;
            for(int i=0;i<n;i++)
                count+=upper_bound(matrix.get(i),0,m,mid);
               
            if(count>=((n*m)+1)/2)
                max=mid;
            else
                min=mid+1;
            
        }
       return min;
      
	}
    
}
