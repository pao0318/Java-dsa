// https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1#
class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
           String[] output = S.split("[.]");  // dot is a special character
       reverseStringArray(output);
       String res = String.join(".",output);
       return res;
        
    }
    void reverseStringArray(String[] s){
       int low=0;
       int high = s.length-1;
       while(low<high){
           String temp = s[low];
           s[low]=s[high];
           s[high]=temp;
           low++;
           high--;
       }
   }
    
}
