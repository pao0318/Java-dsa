class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
            return false;
        
    int left = 0;
    int[] s1a = new int[26];
    int[] s2a = new int[26];
    
    for(int i=0; i<s1.length(); i++){
        s1a[s1.charAt(i) - 'a']++;
        s2a[s2.charAt(i) - 'a']++;
    }
    
    for(int i = s1.length(); i<s2.length(); i++){
        if(Arrays.equals(s1a, s2a)) return true;
        s2a[s2.charAt(i)-'a']++;
        s2a[s2.charAt(left) - 'a']--;
        left++;
    }
    
    if(Arrays.equals(s1a, s2a)) return true;
    else return false;
}
    }
