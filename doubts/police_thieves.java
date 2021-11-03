// https://practice.geeksforgeeks.org/problems/e47329920b4e75869ea7b0e9b7c59ea145ccc22c/1/#
class Solution 
{ 
    static int catchThieves(char arr[], int n, int k) 
	{ 
    List<Integer> police=new ArrayList<>();
    List<Integer> theif=new ArrayList<>();
    
    for(int i=0;i<n;i++){
        if(arr[i]=='P')
            police.add(i);
        else
            theif.add(i);
	} 
	int i=0;
	int j=0;
	int c=0;
	int m1=police.size();
	int m2=theif.size();
	while(i<m1 && j<m2){
	    int a=police.get(i);
	    int b=theif.get(j);
	    if(Math.abs(a-b)<=k){
	        i++;
	        j++;
	        c++;
	    }
	    if(Math.abs(a-b)>k){
	        i++;
	    }
	    
	}
	
	return c;
	
	}
} 
