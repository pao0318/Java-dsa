// https://practice.geeksforgeeks.org/problems/validate-an-ip-address-1587115621/1#
class Solution {

    public boolean isValid(String s) {
        
        int count=0;
   
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='.')
                count++;
            char c=s.charAt(i);
            if(c >= 'a' && c <='z'){
                return false;
            }
        }
        if(count!=3)
            return false;
        String []ch=s.split("\\.");
        int n=ch.length;

        for(String word: ch){
           
            if(word.length()!=0 && word.length()<3){
                
                int num=Integer.parseInt(word);
                //  System.out.println(num);
                if(num>255)
                   return false;
            }
            else
                return false;
        }
        
            return true;
          
    }
}
