// 
import java.io.*;
import java.util.*;
public class Main{
    
    public static void main (String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
       
        printgray(n);
        
    }
    public static void printgray(int n){
        ArrayList<String> arr = new ArrayList<String>();
        arr = generateGray(n);
 
    // print contents of arr
        for (int i = 0 ; i < arr.size(); i++)
            System.out.println(arr.get(i));
    }
    
    public static ArrayList<String> generateGray(int n){
        if(n<=0){
            ArrayList<String> temp = new ArrayList<String>(){
                {add("0");}};
            return temp;
        }
        if(n==1){
            ArrayList<String> temp= new ArrayList<String>(){
                {add("0");add("1");}
            };
            return temp;
        }
        
        ArrayList<String> temp= generateGray(n-1);
        
        ArrayList<String> ans= new ArrayList<>();
        
        // Append 0 to the first half
        for(int i=0;i<temp.size();i++){
            String s=temp.get(i);
            ans.add("0"+s);
        }
        // Append 1 to second half
        for(int i=temp.size()-1;i>=0;i--){
            String s=temp.get(i);
            ans.add(s+"1");
        }
        return ans;
    }
 
}
