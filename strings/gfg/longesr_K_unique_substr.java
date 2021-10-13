// https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1/#
class Solution {
    public int longestkSubstr(String s, int k) {
        int j=0;
        int max=-1;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            // if hit window size k
            if(map.size()==k){
                max=Math.max(max,i-j+1);
            }
            if(map.size()>k){
                while(map.size()>k){
                    char c1=s.charAt(j);
                    if(map.get(c1)==1)
                        map.remove(c1);
                    else
                        map.put(c1,map.get(c1)-1);
                    j++;    
                }
            }
        }
        return max;
    }
}
