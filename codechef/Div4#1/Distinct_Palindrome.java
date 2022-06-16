




























// My Solution

import java.util.*;
public class Five {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            boolean flag=false;
            if(n<(2*x)-1){
                System.out.println(-1);
                continue;
            }

            int globalfreq=n/x;
          Map<Character,Integer>map= new HashMap<>();
          char []arr= new char[n];
          char next=(char)97;
          for(int i=0;i<=n/2;i++){
              map.put(next,map.getOrDefault(next,0)+2);
              arr[i]=next;
              arr[n-i-1]=next;
              if(map.get(next)>=globalfreq)
                  next= (char)(next+1);

          }

              String res="";
            Set<Character>set= new HashSet<>();
              for(int i=0;i<arr.length;i++){
                  res+=arr[i];
                  set.add(arr[i]);
              }
              if(set.size()!=x)
                  System.out.println(-1);
              else
                System.out.println(res);

        }
    }

}


