class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
       
       ArrayList<Integer> res=new ArrayList<>();
       int carry=0;
       for(int i=N-1;i>=0;i--){
           int dig=arr.get(i);
           if(i==N-1){
               if(dig==9){
                   res.add(0);
                   carry=1;
               }
               else
                   res.add(dig+1);
           }
           else{
               dig=dig+carry;
               carry=dig/10;
               res.add(dig%10);
           }
       }
       if(carry!=0)
           res.add(carry);
       
       Collections.reverse(res);
       return res;
        
    }
};
