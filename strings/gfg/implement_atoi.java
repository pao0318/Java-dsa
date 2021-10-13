// https://practice.geeksforgeeks.org/problems/implement-atoi/1#
class Solution
{
    int atoi(String str) {
        int num=0;
	    for(int i=0;i<str.length();i++){
	        char c=str.charAt(i);
	        if((c>='0' && c<='9') || (c=='-' && i==0)){
	            if(str.charAt(0)=='-'){
	                num=num*10;
	                if(c=='-')
	                    num=num*-1;
	               else
	                    num=num-(c-'0');
	            }
	            else{
	                num=num*10;
	                num+=(c-'0');
	            }
	        }
	        else
	            return -1;
	    }
	    return num;
	    
    }
}
