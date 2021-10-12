//https://practice.geeksforgeeks.org/problems/longest-prefix-suffix2527/1# 
class Solution {
    int lps(String s) {
        int n=s.length();
        int[]arr=new int[n];
        Arrays.fill(arr,0);
        arr[0]=0;
        int i=0;
        int j=1;
        while(j<n){
            if(s.charAt(j)==s.charAt(i)){
                arr[j++]=i+1;
                i++;
            }
            else{
                if(i!=0)
                    i=arr[i-1];
                else    
                    arr[j++]=0;
            }
        }
        return arr[n-1];
    }
}
