import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        ArrayList<String> ip=new ArrayList<>();
        ip.add("a");
        ip.add("b");
        ip.add("c");
        
        ArrayList<String>op=new ArrayList<>();
        op.add(ip.get(0));
        solve(ip,op);
    }
    static void solve(ArrayList<String> ip,ArrayList<String>op){
        if(ip.size()==0){
            System.out.println(op);
            return;
        }
        ArrayList<String> op1=op;
        ArrayList<String> op2=op;
        op1.add("_");
        op1.add(ip.get(0));
        op2.add(ip.get(0));
        ip.remove(0);
        solve(ip,op1);
        solve(ip,op2);
        
    }
}
