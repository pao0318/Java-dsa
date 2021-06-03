import java.util.*;
 class custom_comparator implements Comparator <Student>{
     public int compare(Student s1, Student s2){
         //for ascending order
         return s1.rollno-s2.rollno;
     }
 }
 
 //custom class
 class Student{
     int rollno;
     String name;
     //const
     Student(int roll, String name){
         rollno=roll;
         this.name=name;
     }
 }
 
 public class Main{
     public static void main(String args[]) throws Exception{
         Student arr[]= new Student[5];
         arr[0]=new Student(7,"Anurag");
         arr[1]=new Student(2,"Alok");
         arr[2]=new Student(17,"Julia");
         arr[3]=new Student(20,"Porter");
         arr[4]=new Student(1,"ooY");
         
         
        Arrays.sort(arr , new custom_comparator());

        System.out.println();
        for(int i = 0;i<5;i++){
            System.out.println(arr[i].rollno+" "+arr[i].name);
        }
     }
 }
