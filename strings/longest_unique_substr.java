import java.util.*;
public class longest_substring {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        HashMap<Character,Integer>map= new HashMap<>();

        int ptr1=0;
        int len=0;

        for(int i=0;i<n;i++){
           if(map.containsKey(s.charAt(i)))
               ptr1=Math.max(ptr1,map.get(s.charAt(i))+1);

            map.put(s.charAt(i),i);
            len=Math.max(len,i-ptr1+1);
         
        }
        System.out.println(len);


    }
}
