// https://www.codingninjas.com/codestudio/problems/983635?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1

import java.util.stream.Collectors;
import java.util.*;
import java.lang.*;

public class Solution {

	public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
		ArrayList<String> list= new ArrayList<>();
        
        helper(0,s,dictionary,list, new LinkedList<String>());
        
        return list;
	}
    
    public static void helper(int ind, String s,ArrayList<String> dictionary,ArrayList<String> list,
                            LinkedList<String>t ){
        if(ind==s.length()){
          list.add(t.stream().collect(Collectors.joining(" ")));
            return;
        }
        
        for(int i=ind;i<s.length();i++){
            String str=s.substring(ind,i+1);
            if(dictionary.contains(str)){
                t.add(str);
                helper(i+1, s,dictionary,list,t);
                t.removeLastOccurrence(str);
            }
            
        }

        
        
    }
}


// Or GFG WALA


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
