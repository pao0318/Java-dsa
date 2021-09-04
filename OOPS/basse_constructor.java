import java.util.*;
class Calc{
    int num1;
    int num2;
    int res;
    public Calc(){
        num1=5;
        num2=5;
        System.out.println("in constructor");
    }
}
class Main{
    public static void main(String args[]){
        Calc obj=new Calc(); //constructor
        System.out.println(obj.num1);
    }
}
