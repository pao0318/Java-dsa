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
        int ans=list2.get(0)-list1.get(1);
        int ans2=list2.get(0)-list1.get(0);
        list1.remove(0);
        
        boolean flag=false;
        for(int i=0;i<N-1;i++){
            if(list1.contains(list2.get(i)-ans)){
                flag=true;
                break;
        }
        }
        if(flag)
            System.out.println(ans2);
        else
            System.out.println(ans);
        
   
            
    }
}
