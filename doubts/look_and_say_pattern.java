// https://practice.geeksforgeeks.org/problems/implement-atoi/1#
class Solution{
    static String lookandsay(int n) {
        if(n==1)
            return "1";
        if(n==2)
            return "11";
            
        String res=lookandsay(n-1);
        StringBuilder newres=new StringBuilder();
        int count=1;
        for(int i=1;i<res.length();i++){
            if(res.charAt(i-1)!=res.charAt(i)){
                newres.append(count);
                newres.append(res.charAt(i-1));
                count=1;
            }
            else
                count++;
            if(i==res.length()-1){
                newres.append(count);
                newres.append(res.charAt(i));
            }
        }
        return newres.toString();
        
    }
}
