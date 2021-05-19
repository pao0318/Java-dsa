import java.util.Hashtable;
import java.util.Map;
public class HashTable{
    public static void main(String args[]) throws Exception{
        Hashtable<String, Integer> marks=new Hashtable<String, Integer>();
        marks.put("Naveen",100);
        marks.put("Tom",200);
        marks.put("Lisa",300);
        marks.put("Ram",600);
        // marks.put("Test",100m);
        System.out.println(marks.get("Naveen"));
        System.out.println(marks.get("Naveen"));
        System.out.println(marks.get("Tom"));
        System.out.println(marks.get("Test"));
        
        
    }
}
