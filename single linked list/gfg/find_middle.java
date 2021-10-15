// 
import java.util.*;
 class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
class Main{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Node head=new Node(sc.nextInt());;
            Node ptr=head;
            for(int i=0;i<n-1;i++){
                ptr.next=new Node(sc.nextInt());
                ptr=ptr.next;
            }
            Main obj=new Main();
            int ans=obj.findmiddle(head);
            System.out.println(ans);
            
        }
    }
    
    static int findmiddle(Node head){
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    
   
    
}
