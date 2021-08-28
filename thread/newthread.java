class Printer{
    void printDoc(int num, String docname){
        for(int i=1;i<=10;i++){
            System.out.println(">>Printing "+docname+" "+i);
        }
    }
}

class Mythread extends Thread{
    Printer pRef;
    Mythread(Printer p){
        pRef=p;
    }
    @Override
    public void run(){
        pRef.printDoc(10,"John");
    }
}


public class Main{
    public static void main(String args[]){
        System.out.println("---Application Started---");
       
        Printer printer=new Printer();
        printer.printDoc(10,"JAISHREERAM.PDF");
        
        Mythread mRef=new Mythread(printer);
        mRef.start();
        
        System.out.println("---Application Ended--");
    }
}
