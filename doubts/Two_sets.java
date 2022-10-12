// 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class twosets {
    public static void main(String args[]) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        
        long sum= (long)(t)*(long)(t+1)/2;
       
        if(sum%2==0){
            System.out.println("YES");
            long mid=sum/2;
      
            List<Integer>list1= new ArrayList<>();
            List<Integer>list2= new ArrayList<>();

          
            for(int i=t;i>=1;i--){
                if(i<=mid){
                    list1.add(i);
                    mid=mid-i;
                }
                else
                    list2.add(i);
            }
            System.out.println();
            System.out.println(list1.size());
            for(int i=0;i<(int)list1.size();i++)
                System.out.print(list1.get(i)+" ");

            System.out.println();

            System.out.println(list2.size());
            for(int i=0;i<list2.size();i++)
                System.out.print(list2.get(i)+" ");

  
        }

         else
            System.out.print("NO");
        
 
        }

 
    }
