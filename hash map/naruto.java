import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]A={5,6,1,3,4,2};
		int[]B={1,5,2,4,6,3};
		int X=sc.nextInt();
		int Y=sc.nextInt();
		
// 		Case 1
        int cost1=0;
        int cost2=0;
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<A.length;i++)
            map.put(A[i],i);
            
        for(int j=0;j<B.length;j++){
            if(B[j]!=A[j]){
                int index=map.get(B[j]);
                for(int k=j;k<=index;k++){
                    list.add(A[k]);
                    cost1+=X;
                }
                
            }
            if(list.contains(B[j]))
                    continue;
            
        }
        // ending of first case
        for(int a=0;a<B.length;a++){
            if(B[a]!=A[a]){
                int index=map.get(B[a]);
                for(int k=a;k<=index;k++){
                    list2.add(A[k]);
                }
                cost2+=Y;
            }
            if(list2.contains(B[a]))
                continue;
        }
        System.out.println(Math.min(cost1,cost2));
	}
}
