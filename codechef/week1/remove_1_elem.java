import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer> list1=new ArrayList();
        ArrayList<Integer> list2=new ArrayList();
        for(int i=0;i<N;i++)
            list1.add(sc.nextInt());
        for(int i=0;i<N-1;i++)
            list2.add(sc.nextInt());
            
        Collections.sort(list1);
        Collections.sort(list2);
        int ans=Math.abs(list2.get(0)-list1.get(1));
        
        boolean flag=false;
        
        for(int i=0;i<list2.size();i++){
            if(list1.contains(list2.get(i)-ans)){
                ans=list2.get(0)-list1.get(0);
                break;
            }
        }
        
        
        if(ans<=0)
            ans=list2.get(0)-list1.get(0);
            
        System.out.println(ans);
   
            
    }
}
