import java.util.*;
public class Main{
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char [] str=new char[2*n];
        int open=n;
        int close=n;
        int pos=0;
        printparenthesis(str,open,close,pos);
    }
  
    
    static void printparenthesis(char str[], int open,int close,int pos){
        if(open==0&&close==0){
            for(int i=0;i<str.length;i++)
                System.out.print(str[i]);
            System.out.println();
            return;
        }
        else{
            if(open<close){
                str[pos]=')';
                printparenthesis(str,open,close-1,pos+1);
            }
            if(open!=0){
                str[pos]='(';
                printparenthesis(str,open-1,close,pos+1);
            }
        }
        return;
    }
}
