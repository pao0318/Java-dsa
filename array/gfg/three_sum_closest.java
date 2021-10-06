// https://practice.geeksforgeeks.org/problems/three-sum-closest/1/
class Solution 
{ 
    static int threeSumClosest(int[] array, int target)  
	{ 
	    int mindif=Integer.MAX_VALUE;
	    int res=Integer.MIN_VALUE;
	    
        Arrays.sort(array);
        
        // int res=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            int sum=array[i];
            
            int l=i+1;
            int h=array.length-1;
            while(l<h){
                int temp=array[l]+array[h]+sum;
                int dif=Math.abs(temp-target);
                
                if(dif==0)
                    return temp;
                else if(temp<target)
                    l++;
                else
                    h--;
                if(mindif==dif)
                    res=Math.max(res,temp);  
                else{
                    mindif=Math.min(mindif,dif);
                    if(dif==mindif)
                        res=temp;
                }    
            }
            
        }
        return res;
	} 
} 
