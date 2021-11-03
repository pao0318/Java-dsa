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
	    if(b<=a+k && b>=a-k){
	        i++;
	        j++;
	        c++;
	    }
	    else if(a-k>b){
	        j++;
	    }
	    else
	        i++;
	    
	}
	
	return c;
	
	}
} 
