import java.util.*;
// class Shape{
//     void draw(){
//         System.out.println("Drawing a shape");
//     }
// }
abstract class Shape{
    Shape(){
        System.out.println("Shape is constructed");
    }
    abstract void draw();
}

class Circle extends Shape{ //Object to Object Inheritance
    void draw(){
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing a Rectangle");
    }
}

class Polygon extends Shape{
    void draw(){
        System.out.println("Drawing a Polygon");
    }
}

public class Main{
    public static void main(String []args){
        // Shape s;
        //  s=new Shape();
        //  s.draw();
        //  Circle c;
        //  c=new Circle();
        //  c.draw();
        
        // Runtome polymorphism
        Shape s;
        s=new Circle();// Polymorphic state 
        s.draw();
        s=new Rectangle();
        s.draw();
        
        s=new Polygon();
        s.draw();
        // s=new Shape() no use for creating shape class object
        // abstract class cant have objects
        // Parent obj will be constructed at runtime before child object
        
        
        
        
    }
}
