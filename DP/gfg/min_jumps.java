class Solution{
    static int minJumps(int[] arr){
        
        
        int n=arr.length;

        
        int steps=0;
        int maxindex=0;
        int current=0;
        for(int i=0;i<n-1;i++){
            maxindex=Math.max(maxindex,i+arr[i]);
            if(i==current){
                steps++;
                current=maxindex;
            }
        }
        if(current<n-1)
            return -1;
        return steps;
    }
}
