import java.util.*;
// class Shape{
//     void draw(){
//         System.out.println("Drawing a shape");
//     }
// }
// abstract class Shape{
//     Shape(){
//         System.out.println("Shape is constructed");
//     }
//     abstract void draw();
// }

interface Shape{
    // for interface neither user nor runtime can create object
    void draw();
}
class Circle implements Shape{// extends //Not obj to obj inheritance
    public void draw(){
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape{// extends
    public void draw(){
        System.out.println("Drawing a Rectangle");
    }
}

class Polygon implements Shape{// extends
    public void draw(){
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
