// 1st method
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int end = 0;
        if (n == 0)
            return "";
        boolean[][] dp = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                boolean startEqEnd = s.charAt(j) == s.charAt(i);

                if (i == j) {
                    // If the same char: 'a' is palindrome
                    dp[i][j] = true;
                } else if (i - j == 1) {
                    // If length 2: 'ab' is palindrome when 'a' == 'b'
                    dp[i][j] = startEqEnd;
                } else if (startEqEnd && dp[i - 1][j + 1]) {
                    // Otherwise: string is palindrome if s(i) == s(j) and substring s(j + 1, i - 1)
                    // is palindrome
                    dp[i][j] = true;
                }

                if (dp[i][j] && i - j > end - start) {
                    end = i;
                    start = j;
                }
            }
        }

        return s.substring(start, end + 1);
    }
}

// 2nd expanding
class Solution {
    public String longestPalindrome(String s) 
    {
        if(s.length()<2){return s;} // edge case handling
        String longest = "";
        for(int i = 0; i < s.length(); i++)
        {
            String even = expandFromIndex(s,i,i);
            if(longest.length()<even.length()){
              longest = even;
            } // Case even length Palindrome
          
            String odd = expandFromIndex(s,i,i+1);
            if(longest.length()<odd.length()){
              longest = odd;
            } // case odd length Palindrome
        }
        return longest;
    }
    //Expands Linearly on both sides and  returns the current longest palindromic substring
    public String expandFromIndex(String s, int left, int right)
    {
        while(left>= 0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return(s.substring(left+1,right));
    }
}
