// https://practice.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621/1
class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        int n=s.length();
        int m=p.length();
        char[]ch=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<m;i++){
            if(!map.containsKey(p.charAt(i)))
                map.put(p.charAt(i),1);
            else
                map.put(p.charAt(i),map.get(p.charAt(i))+1);
        }
        int i=0;
        int j=0;
        String res="-1";
        int min=Integer.MAX_VALUE;
        int count=map.size();
        while(j<n){
            if(map.containsKey(ch[j])){
                map.put(ch[j],map.get(ch[j])-1);
                
                if(map.get(ch[j])==0)
                    count--;
            }
            while(count==0){
                int num=j-i+1;
                if(min>num){
                    min=num;
                    res=s.substring(i,j+1);
                }
                if(map.containsKey(ch[i])){
                    map.put(ch[i],map.get(ch[i])+1);
                    
                    if(map.get(ch[i])>0)
                        count++;
                }
                i++;
                
            }
            j++;
        }
        return res;
        
    }
}
