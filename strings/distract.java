import java.util.*;
public class Main{
    public static int Suspicious(String s, int len){
        String str=" ";
        for (int i=0;i<len-1;i++){
            char ch0=s.charAt(i);
            char ch1=s.charAt(i+1);
            if(ch0==ch1)
                ch0=' ';
                
            str=str+ch0;
        }
        
        str=str.trim();
        int count=Search(str);
        if (count==-1)
            return -1;
    }
    
    public static int Search(String str){
        int n1=str.length();
        for(int i=0;i<n1;i++){
            char ch0=str.charAt(i);
            
            for(int j=0;j<n1;j++){
                char ch1=str.charAt(j);
                
                if(ch0==ch1){
                    return -1;
                    break;
                    
                }
            }
            
        }
        
    }
    
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            String s=sc.nextLine();
            int len=s.length();
            int ans=Suspicious(s,len);
            if (ans==-1)
                System.out.println("YES");
            
            else
                System.out.println("NO");
        }
    }
}
