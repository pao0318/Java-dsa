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

