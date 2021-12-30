// https://practice.geeksforgeeks.org/problems/word-break-part-23249/1#

class Solution{
    
    static List<String> wordBreak(int n, List<String> dict, String s)
    {
        List<String> res=new ArrayList<>();
        helper(dict,s,"",res);
        return res;
    }
    
    static void helper(List<String> dict, String s,String str,List<String>res){
        if(s.length()==0){
            res.add(str.substring(1));
            return;
        }
        
        for(int i=0;i<=s.length();i++){
            if(dict.contains(s.substring(0,i)))
                helper(dict,s.substring(i),str+" "+s.substring(0,i),res);
            
                
        }
        
    }
    
}
