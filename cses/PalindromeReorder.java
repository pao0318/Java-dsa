import java.io.*;
import java.util.*;
public class Main{
    public static void main (String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String a1=br.readLine();
        char []arr=a1.toCharArray();
        Arrays.sort(arr);
        
        StringBuilder t1=new StringBuilder();
        Map<Character,Long> map= new HashMap<>();
        
        for(long i=0;i<arr.length;i++)
            map.put(arr[i],map.getOrDefault(arr[i],0)+1l);
        
        
        
        // Check for palindrome
        
        int cnt=0;
        for(Map.Entry<Character,Long> x: map.entrySet()){
            if(x.getValue()==1)
                cnt++;
        }
        
        if(cnt>1)
            System.out.println(-1);
        
        
        
        // Answer
        else{
            char temp;
            
             for(Map.Entry<Character,Long> x : map.entrySet()){
                long f=x.getValue();
                char s1=x.getKey();
                
                if(f==1)
                    temp=s1;
                
                for(long i=0;i<f/2;i++)
                    t1.append(s1);
        }
        
        StringBuilder t2= new StringBuilder(t1);
        t2=t1.reverse();
        if(temp!='\0')
            t1.append(temp);
        
        t1.append(t2);
        
        System.out.println(t1);
        }
  
        
        
    }
}
