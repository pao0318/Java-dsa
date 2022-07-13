// https://www.codingninjas.com/codestudio/problems/1115738?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=1
import java.util.ArrayList;

public class Solution {
    public final static int d = 256;
	public static ArrayList<Integer> stringMatch(String str, String pat) {
		ArrayList<Integer> list= new ArrayList<>();
        int prime = 31;   
        search(str,pat,prime,list);
        return list;
    
	}
    
    static void search(String str, String pat,int prime,ArrayList<Integer> list){
        int m=pat.length();
        int n=str.length();
        
        int j;
        int p=0;
        int st=0;
        int h=1;
        for(int i=0;i<m-1;i++)
            h=(h*d)%prime;
        
        for(int i=0;i<m;i++){
            p=(d*p+ pat.charAt(i))%prime;
            st=(d*st+str.charAt(i))%prime;
        }
        
        for(int i=0;i<=n-m;i++){
            if(p==st){
                for(j=0;j<m;j++){
                    if(str.charAt(i+j)!=pat.charAt(j))
                        break;
                }
                if(j==m)
                    list.add(i);
            }
            if(i<n-m){
                st=(d*(st-str.charAt(i)*h)+ str.charAt(i+m))%prime;
                if(st<0)
                    st=st+prime;
            }
            
        }
        
        return;
        
    }
}
