// https://leetcode.com/problems/first-unique-character-in-a-string/submissions/ 
class Solution {
    public int firstUniqChar(String s) {
        int []ans= new int[26];
        int minInd=-1;
       
        for(int i=0;i<s.length();i++){
            int val=s.charAt(i)-97;
            if(ans[val]==0)
                ans[val]=i+1;
            else
                ans[val]=-1;
                
        }
        for(int i:ans){
            if(i>0 && (minInd==-1||minInd>i-1))
                minInd=i-1;
        }
        return minInd;
    }
}
