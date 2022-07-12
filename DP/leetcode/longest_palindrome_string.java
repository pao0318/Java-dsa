// https://www.codingninjas.com/codestudio/problems/longest-palindromic-substring_758900?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=0
// Brute Approach
public class Solution {	
	public static String longestPalinSubstring(String str) {
		
        int n=str.length();
        
        int maxlen=1;
        int start=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                
                int flag=1;
                String s=str.substring(i,j+1);
                if(isPalindrome(s) && (j-i+1)>maxlen){
                    start=i;
                    maxlen=j-i+1;
                }
        
            }
        }
        
        return str.substring(start,start+maxlen);
	}
    
    public static boolean isPalindrome(String temp){
        int start=0;
        int end=temp.length()-1;
        while(start<end){
            if(temp.charAt(start)!=temp.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}



// Dp approach
public class Solution {	
	public static String longestPalinSubstring(String str) {
		
        int n=str.length();
        boolean [][]dp= new boolean[n][n];
        int start=0;
        int end=0;
        
        for(int i=0;i<n;i++){
            for(int j=i;j>=0;j--){
                boolean flag=str.charAt(i)==str.charAt(j);
                
                if(i==j)
                    dp[i][j]=true;
                
                else if(i-j==1)
                    dp[i][j]=flag;
                
                else if(flag && dp[i-1][j+1])
                    dp[i][j]=true;
                
                if(dp[i][j] && i-j>end-start){
                    end=i;
                    start=j;
                }
                
            }
        }
        
return str.substring(start,end+1);
	}
    
    
}

// Space Optimized
public class Solution {	
	public static String longestPalinSubstring(String str) {
		
       int start=0;
        int end=0;
        int n=str.length();
        for(int i=0;i<n;i++){
            int len1=expand(str,i,i);
            int len2=expand(str,i,i+1);

            int len=Math.max(len1,len2);

            if(len>end-start+1){
                start=i-(len-1)/2;
                end=i+(len)/2;
            }
        }
        return str.substring(start,end+1);
        
    }
    
    
    public static int expand(String str, int left, int right){
        int start=left;
        int end=right;
        int n=str.length();

        while(start>=0 && end<n && str.charAt(start)==str.charAt(end)){
            start--;
            end++;
        }
        return end-start-1;
    }
}


