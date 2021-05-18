import java.util.*;
public class Main{
    public static class Student{
        private int rollno;
        private String name;
        public Student(int rollno, String name){
            this.rollno=rollno;
            this.name=name;
        }
        public String getname(){
            return this.name;
        }
        public int getmarks(){
            return this.rollno;
        }
        
        public void setname(String name){
            this.name=name;
        }
            
        public void setmarks(int rollno){
            this.rollno=rollno;
        }
           
        // @Override    
        public int hashCode(){
            final int temp=14;
            int ans=1;
            ans=temp*ans+rollno;
            return ans;
        }    
        
        // @Override
        public boolean equals(Object o){
            if(this==o)
                return true;
            
            if (this==null)
                return false;
            
            if(this.getClass()!=o.getClass())
                return false;
            
            Student other =(Student)o;
             if (this.rollno != other.rollno) 
                return false;
            
            return true;
        }
        
    }
    public static void main(String args[]) throws Exception{
        HashMap<Student, String> map=new HashMap<>();
        Student one=new Student(1,"LELEMUHHME");
        Student two=new Student(2,"LELiyabro");
        
        // put key in map
        map.put(one,one.getname());
        map.put(two,two.getname());
        
        one.setname("NAHILEGAMUHHME");
        two.setname("NOBroo");
        
        // still prints old datas
        System.out.println(map.get(one));
        System.out.println(map.get(two));
        // new key with same rollno
        Student three = new Student(1, "Jaishreeram");
        System.out.println(map.get(three));
    }


    
}
