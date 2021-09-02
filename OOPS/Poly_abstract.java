import java.util.*;
class Shape{
    void draw(){
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape{
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
        
        Shape s;
        s=new Circle();// Polymorphic state 
        s.draw();
    }
}
