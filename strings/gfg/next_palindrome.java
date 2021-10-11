// https://practice.geeksforgeeks.org/problems/next-higher-palindromic-number-using-the-same-set-of-digits5859/1#


import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.nextPalin(s));
        }
            
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String nextPalin(String N) 
    { 
        //complete the function here
        if(N.length()<=3){
            return "-1";
        }
        
        String firstHalf = N.substring(0,N.length()/2);
        
     //   System.out.println(firstHalf);
        
        String nextPermuHalf = nextPermutation(firstHalf);
        
    //    System.out.println(nextPermuHalf);    
        
        if(nextPermuHalf.equals(firstHalf)){
            return "-1";
        }
        StringBuilder ans = new StringBuilder(nextPermuHalf);
        
        if(N.length() % 2 == 1)
        {
            ans.append(N.charAt(N.length() / 2));
        }
        
        //        System.out.println(ans.toString());    

        StringBuilder secondHalf = new StringBuilder(nextPermuHalf);
        secondHalf.reverse();
        ans.append(secondHalf.toString());
        
                       //System.out.println(ans.toString());    

        return ans.toString();
        
        
    }
    
    public String nextPermutation(String str){
     
        
        int  last = str.length()-2;
        
        while(last>=0){
            if(str.charAt(last)<str.charAt(last+1)){
                break;
            }
            --last;
        }
        
        if(last<0){
            return str;
        }
        
        int nextGreatest = str.length()-1;
        
        for (int i = str.length() - 1; i > last; i--) {
            if (str.charAt(i) > str.charAt(last)) {
                nextGreatest = i;
                break;
            }
        }

        char arr []=str.toCharArray();
        
        swap(arr, last, nextGreatest);
        reverse(arr, last+1);
        
        return new String(arr);
    }
    
    
    public void swap(char arr[], int last, int secondLast){
        //System.out.println(new String(arr)+"  "+last+"  "+secondLast);
        char temp = arr[last];
        arr[last]=arr[secondLast];
        arr[secondLast]=temp;
    }
    
    public void reverse(char arr[], int start){
        int end = arr.length-1;
        
        while(start<=end){
            char temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            ++start;
            --end;
        }
    }
}
