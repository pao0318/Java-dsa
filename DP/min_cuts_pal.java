// https://www.geeksforgeeks.org/palindrome-partitioning-dp-17/
// Java Code for Palindrome Partitioning
import java.util.*;
public class Main{
    public static void main (String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int j=s.length()-1;
        int i=0;
        System.out.println(solve(s,i,j));
    }
    static int solve(String s, int i, int j){
        if(i>=j ||isPalindrome(s,i,j))
            return 0;

        int min=Integer.MAX_VALUE;    
        for(int k=i;k<j;k++){
            int temp=1+solve(s,i,k)+solve(s,k+1,j);
            min=Math.min(min,temp);
        }    
        return min;
            
    }
    static boolean isPalindrome(String s,int i,int j){
       while(i<j){
           if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
       }
       return true;
    }
}
