// https://leetcode.com/problems/implement-strstr/
class Solution {
    public int strStr(String haystack, String needle) {
        int len=needle.length();
        if(len==0)
            return 0;
        for(int i=0;i<haystack.length();i++){
            if(i+len>haystack.length())
                break;
            String s=haystack.substring(i,i+len);
            if(s.equals(needle))
                return i;
        }
        return -1;
    }
}
