import java.util.*;
public class Main
{
    static TreeMap<Integer,Integer> left;
    static TreeMap<Integer,Integer>right;
    static int leftSize;
    static int rightSize;
	public static void main(String[] args) {

		left = new TreeMap<>(Collections.reverseOrder());
		right = new TreeMap<>();
		leftSize = 0;
		rightSize=0;

	
	    insert(2);
	    insert(4);
	    insert(3);
	    getMedian();
	    insert(10);
	    remove(2);
	    getMedian();
		
		

	}
	
	static void insert(int x){
	    if(leftSize==0 || x<=left.firstKey()){
	        add(left,x);
	        leftSize++;
	    }
	    else{
	        add(right,x);
	        rightSize++;
	    }
	    
	    balance();
	    
	}
	static void remove(int x){
	    // Now compare which TreeMap it will go
	    if(leftSize>0 && x<=left.firstKey()){
	        erase(left,x);
	        leftSize--;
	    }
	    else{
	        erase(right,x);
	        rightSize--;
	    }
	    
	    balance();
	    
	}
	static void getMedian(){
	    if(leftSize+rightSize==0){
	        System.out.println(-1);
	        return;
	    }
	    if(leftSize==rightSize){
	        System.out.println((left.firstKey()+right.firstKey())/2);
	    }
	    else{
	        System.out.println(left.firstKey()); 
	    }
	    
	}
    static void balance(){
    
        if(leftSize > rightSize + 1){
            int val = left.firstKey();  
            erase(left,val);
            add(right,val);
    
            leftSize--;
            rightSize++;
        }
    
        else if(rightSize > leftSize){
            int val = right.firstKey(); 
            erase(right,val);
            add(left,val);
    
            rightSize--;
            leftSize++;
        }
    }
	static void erase(TreeMap<Integer,Integer>map,int x){
	    int cnt = map.get(x);

        if(cnt == 1)
            map.remove(x);
        else
            map.put(x,cnt-1);
	}
	
    static void add(TreeMap<Integer,Integer> map,int x){
        map.put(x,map.getOrDefault(x,0)+1);
    }
}
