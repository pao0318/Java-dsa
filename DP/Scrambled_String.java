// https://www.interviewbit.com/problems/scramble-string/hints/
public class Solution {
	public int isScramble(final String s1, final String s2) {
	    if(s1==null||s2==null||s1.length()!=s2.length())
	        return 0;
	    if(s1.equals(s2))
	        return 1;
	    char a1[],a2[];
	    a1=s1.toCharArray();
	    a2=s2.toCharArray();
	    Arrays.sort(a1);Arrays.sort(a2);
	    if(!(new String(a1).equals(new String(a2))) )
	        return 0;
	    for(int i=1;i<s1.length();i++){
	        if(isScramble(s1.substring(0,i),s2.substring(0,i))==1&&isScramble(s1.substring(i),s2.substring(i))==1)
	            return 1;
	        if(isScramble(s1.substring(0,i),s2.substring(s2.length()-i))==1&&isScramble(s1.substring(i),s2.substring(0,s2.length()-i))==1)
	            return 1;
	    }
        return 0;	    
	}
}
