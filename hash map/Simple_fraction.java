// https://practice.geeksforgeeks.org/problems/a-simple-fraction0921/1#

class Solution
{
    public String  fractionToDecimal(int numerator, int denominator)
    {
        StringBuilder res=new StringBuilder();
        int q=numerator/denominator;
        int rem=numerator%denominator;
        
        res.append(q);
        if(rem==0)
            return String.valueOf(res);
        res.append('.');
        
        HashMap<Integer,Integer> map=new HashMap<>();
        while(rem!=0){
            if(map.containsKey(rem)){
               int l=map.get(rem);
                res.insert(l,"(");
                res.append(")");
                break;
            }
            
    
            else{
            map.put(rem,res.length());
            rem=rem*10;
            q=rem/denominator;
            rem=rem%denominator;
            res.append(q);
            }
            
        }
        return res.toString();
        
    }
}
