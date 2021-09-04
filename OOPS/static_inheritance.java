import java.util.*;

class  Parent{
    public static void foo(){
        System.out.println("I am foo in super class");
    }
    public void bar(){ //idhr static nhi h to nhi lega
        System.out.println("I am bar in super class");
    }
}

class Main extends Parent{
    public static void foo(){
        System.out.println("I am a foo in child");
    }
    public void bar(){
        System.out.println("I am a bar in child");
    }

    public static void main(String []args){
       
        Parent par=new Main();
        Main child=new Main();
        par.foo();
        child.foo();
        
        par.bar();
        child.bar();
 
        
    }
}

