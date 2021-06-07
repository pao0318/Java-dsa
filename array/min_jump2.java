class Solution{
    static int minJumps(int[] arr){
        int n=arr.length;
        int maxR=arr[0];
        int step=arr[0];
        int jump=1;
        if(n==1)
            return 0;
        else if(arr[0]==0)
            return -1;
            
        for(int i=1;i<n;i++){
            if(i==n-1)
                return jump;
            maxR=Math.max(maxR,i+arr[i]);
            step--;
            if(step==0){
                jump++;
                if(i>=maxR)
                    return -1;
                step=maxR-i;    
        }    
    }
    return jump;
    }
}
