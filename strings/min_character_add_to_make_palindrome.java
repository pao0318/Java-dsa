// https://www.codingninjas.com/codestudio/problems/893000?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=0

class Solution {
    public static int minChar(String str) {
        int n=str.length();
       int left=0;
       int added=0;
       int right=str.length()-1;
       
       while(left<right){
           
           if(str.charAt(left)==str.charAt(right)){
               left++;
               right--;
           }
           
           else{
               left=0;
               added=n-right;
               
              if(str.charAt(left)==str.charAt(right)){
                  added--;
                  left++;
              }
               right--;
           }
       }
       return added;
    }
}



// Ek aur

public class Solution {
    static boolean ispalindrome(String s) {
        int l = s.length();
 
        for (int i = 0, j = l - 1; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static int minCharsforPalindrome(String str) {
        int cnt=0;
        boolean flag=false;
        
        while(str.length()>0){
            if(ispalindrome(str)){
                flag=true;
                break;
            }
            else{
                cnt++;
                str=str.substring(0,str.length()-1);
            }
        }
        return cnt;
    }

}
