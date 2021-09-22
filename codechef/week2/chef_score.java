import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
    class Pair{
	    int time;
	    int score;
	    public Pair(int time, int score){
	        this.time=time;
	        this.score=score;
	    }
	}
	    
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int[]time=new int[3];
	        int[]score=new int[3];
	        int maxPoints=0;
	        int lefttime=240;
	        for(int i=0;i<3;i++){
	            time[i]=sc.nextInt();
	            score[i]=sc.nextInt();
	        }
	        ArrayList<Pair> list=new ArrayList<Pair>();
	       
	        for(int i=0;i<3;i++){
	            list.add(new Pair(time[i],score[i]));
	        }
	        Collections.sort(list, new Comparator<Pair>(){
	            public int compare(Pair p1, Pair p2){
	                if(p1.score>p2.score)
	                    return 1;
	               return -1;     
	            }
	    });
	    int origtime=0;
	   // Calculating score
	   for(int j=0;j<3;j++){
	       origtime=20*list.get(j).time;
	       if(lefttime>=0){
	           maxPoints+=20*list.get(j).score;
	           lefttime=240-origtime;
	       }
	   }
	   System.out.println(maxPoints);
	    }
	    
	    }
	
}
	 

