// 
interface A{
    void msg();
    default void msg1(){
        System.out.println("default hai bhaiya");
    }   
}
class Main implements A{
    public void msg(){
        System.out.println("Main ka message");
    }

    public static void main(String args[]){
        Main obj=new Main();
        obj.msg();
        obj.msg1();
    }
}
