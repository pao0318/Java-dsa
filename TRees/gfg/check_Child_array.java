import java.io.*;
import java.lang.*;
import java.util.*;
 
// Class 1
// Helper class (Node class)
class Main {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating objrct of class 2 inside main() method
        Array_imp obj = new Array_imp();
 
        // Seetting root node
        obj.Root("A");
 
        // obj.set_Left("B", 0);
        obj.set_Right("C", 0);
        obj.set_Left("D", 1);
        obj.set_Right("E", 1);
        obj.set_Left("F", 2);
        obj.print_Tree();
    }
}
 class Array_imp{
     static int root=0;
     static String []str=new String[10];
     
    //  Create root node
    public void Root(String key){
        str[0]=key;
    }
    // Creating left son of Root
    public void set_Left(String key, int root){
        int i=(root*2)+1;
        if(str[root]==null)
            System.out.println("Cant set child at %d"+i);
        else    
            str[i]=key;
    }
    
    public void set_Right(String key, int root){
        int i=(root*2)+2;
        if(str[root]==null)
            System.out.println("Cants set child at %d"+ i);
        else
            str[i]=key;
    }
    
    public void print_Tree(){
        for(int i=0;i<10;i++){
            if(str[i]!=null)
                System.out.print(str[i]);
            else
                System.out.print("_");
        }
    }
    
    

 }
