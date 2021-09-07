import java.util.*;
public class Triangle{
    private int base;
    private int height;
public Triangle(int base, int height){
    this.base=base;
    this.height=height;
}
public Triangle(Triangle obj){
    this.base=obj.base;
    this.height=obj.height;
}
public double calcArea(){
    return 0.5*base*height;
}
public static void main(String args[]){
    Triangle t1=new Triangle(20,10);
    Triangle t2=new Triangle(t1);
    System.out.println("First triangle area"+t1.calcArea());
    System.out.println("Second triangle area"+t2.calcArea());

}
}

// Replace Triangle with MAIN
