import java.util.*;

public class Main
{
	public static void main(String[] args) throws Exception{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t>0){
	        int points=0;
	        int n=sc.nextInt();
	        int []arrA=new int[n];
	        int []arrB=new int[n];
	        long valA=0;
	        long valB=0;
	        
	        for(int i=0;i<n;i++){
	            arrA[i]=sc.nextInt();
	            valA+=arrA[i]*1l*(i+1);
	        }
	        
	            
	       for(int i=0;i<n;i++){
	            arrB[i]=sc.nextInt();
	            valB+=arrB[i]*1l*(i+1);   
	       }
	       
	       System.out.println(valB-valA);    
	       t--;
	    }
	       
	
	}
}
