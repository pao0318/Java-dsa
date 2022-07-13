https://www.codingninjas.com/codestudio/problems/2090383?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1
// 
import java.util.*;

class Solution {
    public String solve(String[] words) {
        int len=words.length;
        if(len==0)
            return "";
        if(len==1)
            return words[0];   
        Arrays.sort(words);
        int minlen=Math.min(words[0].length(), words[len-1].length());

        int i=0;
        while(i<minlen && words[0].charAt(i)==words[len-1].charAt(i))
            i++;
        String res=words[0].substring(0,i);
        return res;

    }
}

// nAYA WALA
import java.util.*;
public class Solution {
    public static int findmin(String[]arr, int n){
        int minindex=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
            minindex=Math.min(minindex, arr[i].length());
        return minindex;
    }
    
    public static boolean allContains(String []arr, int n,String small,int low,int high){
        for(int i=0;i<n;i++){
            String temp=arr[i];
            
            for(int j=low;j<=high;j++){
                if(small.charAt(j)!=temp.charAt(j))
                    return false;
            }
           
        }
         return true;
    }
    
	public static String longestCommonPrefix(String[] arr, int n) {
	    int index=findmin(arr,n);
        String prefix="";
        int low=0;
        int high=index-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(allContains(arr,n,arr[0],low,mid)){
                prefix+=arr[0].substring(low,mid+1);
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        
       return prefix;
        
    }
    

}
