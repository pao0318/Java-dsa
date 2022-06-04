class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        int curr_sum=0;

        HashSet<Integer> map = new HashSet<Integer>();
   
        for(int k:arr){
            curr_sum+=k;
            if(curr_sum==0 ||map.contains(curr_sum) )
                return true;
          
            
            map.add(curr_sum);
                
        }
        
        return false;
            
            
    }
}
