class Solution{
public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[s.length()] = true;
        for(int i = s.length() - 1; i >= 0; i--){
            for(String word: wordDict){
                if(i <= s.length() - word.length() && s.substring(i, i + word.length()).equals(word)){
                    dp[i] = dp[i] || dp[i + word.length()];
                }
            }
        }
        return dp[0];
    }
}
