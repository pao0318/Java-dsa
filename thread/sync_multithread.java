class Printer{
    void printDoc(int num, String docname){
        for(int i=1;i<=10;i++){
            try{
            Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
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
class YourThread extends Thread{
    Printer pRef;
    YourThread(Printer p){
        pRef=p;
    }
    @Override
    public void run(){
        pRef.printDoc(10,"PAOLI.pdf");
    }
}


public class Main{
    public static void main(String args[]){
        System.out.println("---Application Started---");
       
        Printer printer=new Printer();
        // printer.printDoc(10,"JAISHREERAM.PDF");
        
        // We have multiple threads working on same printer object
        // If multiple threads are going to work on same songle onject we must Synchronize them
        Mythread mRef=new Mythread(printer);
        YourThread yRef=new YourThread(printer);
        mRef.start();
        try{
            mRef.join(); 
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        yRef.start();
        
        System.out.println("---Application Ended--");
    }
}
