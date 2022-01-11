import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    
		    int dif=0;
		    
		    dif=c-b;
		    String res="NO";
		    if((b-dif)%a==0 &&(b-dif)>0)
		        res="YES";
		    dif=b-a;
		    if((b+dif)%c==0 && (b+dif)>0)
		        res="YES";
		        
		    if((c-a)%2==0){
		        dif=(c-a)/2;
		        if((a+dif)%b==0 &&(a+dif)>0)
		            res="YES";
		    }
		    System.out.println(res);
		}
	}
}
