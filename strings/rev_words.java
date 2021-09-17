class Solution {
    public String reverseWords(String s) {
        String[]str=s.split(" ");
        
        for(int i=0;i<str.length;i++){
            str[i]=rev(str[i]);
        }
        
        String s3="";
        for(int j=0;j<str.length;j++){
            if(j==str.length-1)
                s3+=str[j];
            else
                s3+=str[j]+" ";
        }
        return s3;
        
    }
    public String rev(String s1){
        String s2="";
        int end=s1.length()-1;
       while(end>=0){
           s2+=s1.charAt(end);
           end--;
       }
        return s2;
    }
   
    
}
// OR
  public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(new StringBuilder(str).reverse().append(" "));
        }
        return sb.toString().trim();
    }
