import java.util.*;
import java.util.Arrays;
public class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        for(int i=0;i<=len;i++){
            String s=sc.nextLine();
            String s2=shuffle(s);
            boolean is=hasAnagram(s,s2);
            System.out.println(print(s2,is));
        }
       
        
    }
    static String print(String s2,boolean is){
        if(is)
            return s2;
        else
            return "IMPOSSIBLE";
    }
    static boolean hasAnagram(String word1, String word2){
        for(int i=0;i<word1.length();i++) {
           
           int pos = word2.indexOf(word1.substring(i, i+1));
           if(pos>=0) 
               word2 = word2.substring(0, pos)+word2.substring(pos+1);
        
           if(word2.length()==0) 
           return true;
      
       }
       return false;
    }
    public static String shuffle(String s1) {
        List<Character> characters = new LinkedList<>();
        for(char c:s1.toCharArray())
            characters.add(c);
        
        StringBuilder result = new StringBuilder();
        for (int i=0;i<s1.length();i++){
            int ranPos = new Random().nextInt(characters.size());
            result.append(characters.get(ranPos));
            characters.remove(ranPos);
        }
        return result.toString();
    }
}
