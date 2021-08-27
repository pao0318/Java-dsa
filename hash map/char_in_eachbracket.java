// https://binarysearch.com/room/nullptr-dereference-ukTjnKttKd
class Solution {
    public int[] solve(String s) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int len=s.length();
        int openBracket=-1;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='('){
                openBracket++;
                map.putIfAbsent(openBracket,0);
            }
            else if(s.charAt(i)==')'){
                openBracket--;
            }
            else{
                map.put(openBracket, map.get(openBracket)+1);  
            } 
            }
        
        int[] arr=new int[map.size()];
        for(int i=0;i<map.size();i++)
            arr[i]=map.get(i);
        return arr;    
                 
    }

    
}
