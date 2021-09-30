// https://leetcode.com/problems/letter-case-permutation/submissions/
class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res=new ArrayList();
       
        helper(s,res,0);
        return res;
    }
    
    void helper(String s,List<String> res, int idx){
            res.add(s);

        for(int i=idx;i<s.length();i++){
            char[]ch=s.toCharArray();
            if(Character.isDigit(ch[i]))
                continue;
            else{
                if(Character.isUpperCase(ch[i])){
                    ch[i]=Character.toLowerCase(ch[i]);
                    helper(String.valueOf(ch),res,i+1);
                }
                else{
                    ch[i]=Character.toUpperCase(ch[i]);
                    helper(String.valueOf(ch),res,i+1);
                }
            }
            
        }
    }
}
