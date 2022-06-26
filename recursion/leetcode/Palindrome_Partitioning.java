// https://leetcode.com/problems/palindrome-partitioning/
class Solution {
       List<List<String>> res= new ArrayList<>();
    public List<List<String>> partition(String s) {
        helper(s,new ArrayList<String>());
        return res;
    }
    
    public void helper(String s, List<String> temp){
        if(s.length()==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<s.length();i++){
            String str=s.substring(0,i+1);
            if(isPalindrome(str)){
                temp.add(str);
                helper(s.substring(i+1),temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    
    private boolean isPalindrome(String s){
int i = 0;
int j = s.length() - 1;
while(i <= j){
if(s.charAt(i) != s.charAt(j)){
return false;
}
i++;
j--;
}
return true;
}
    
}
