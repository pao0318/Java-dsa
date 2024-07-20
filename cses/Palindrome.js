import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            HashMap<Character,Integer> map = new HashMap<>();
            for(int i=0;i<input.length();i++){
                char c=input.charAt(i);
                if(!map.containsKey(c))
                    map.put(c,1);
                else
                    map.put(c, map.get(c)+1);
            }
            //Checking for palindrome
            int cnt=0;
            boolean flag=false;
            for(Map.Entry<Character,Integer>entry :  map.entrySet()){
                if(entry.getValue()%2!=0)
                    cnt++;
            }
            if(cnt>1){
                System.out.println("NO SOLUTION");
            }
            else {
                String res = makePalindrome(map, cnt);
                System.out.println(res);
            }

    }

    public static String makePalindrome(HashMap<Character,Integer> map, int cnt){
        StringBuilder half = new StringBuilder();
        StringBuilder middle = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            half.append(String.valueOf(c).repeat(count / 2));
            if (count % 2 != 0) middle.append(c);
        }
        return half.toString() + middle.toString() + half.reverse().toString();


    }

}
